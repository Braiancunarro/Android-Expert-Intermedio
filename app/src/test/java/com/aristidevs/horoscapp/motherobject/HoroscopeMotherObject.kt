package com.aristidevs.horoscapp.motherobject

import com.aristidevs.horoscapp.data.network.response.PredictionResponse
import com.aristidevs.horoscapp.domain.model.horoscopeInfo
import com.aristidevs.horoscapp.domain.model.horoscopeInfo.*

object HoroscopeMotherObject {
    val anyResponse = PredictionResponse("date" , "prediction" , "taurus")

    val horoscopeInfoList = listOf(
        Aries,
        Taurus,
        Gemini,
        Cancer,
        Leo,
        Virgo,
        Libra,
        Scorpio,
        Sagittarius,
        Capricorn,
        Aquarius,
        Pisces
    )
}