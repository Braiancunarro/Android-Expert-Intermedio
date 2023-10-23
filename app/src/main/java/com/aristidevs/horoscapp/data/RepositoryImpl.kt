package com.aristidevs.horoscapp.data

import android.util.Log
import com.aristidevs.horoscapp.data.network.HoroscopeAPIService
import com.aristidevs.horoscapp.data.network.response.PredictionResponse
import com.aristidevs.horoscapp.domain.model.PredictionModel
import com.aristidevs.horoscapp.domain.model.Repository
import retrofit2.Retrofit
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeAPIService):Repository {
    override suspend fun getPrediction(sign: String):PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("Aris", "Ha ocurrido un error ${it.message}") }
        return null
    }
}