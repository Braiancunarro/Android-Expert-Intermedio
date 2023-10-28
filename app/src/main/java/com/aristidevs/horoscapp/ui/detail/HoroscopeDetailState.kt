package com.aristidevs.horoscapp.ui.detail

import com.aristidevs.horoscapp.domain.model.HoroscopeModel
import com.aristidevs.horoscapp.domain.model.PredictionModel

sealed class HoroscopeDetailState {

    data object Loading:HoroscopeDetailState()
    data class Error(val error:String): HoroscopeDetailState()
    data class Success(val prediction:String, val sing:String, val horoscopeModel: HoroscopeModel): HoroscopeDetailState()
}