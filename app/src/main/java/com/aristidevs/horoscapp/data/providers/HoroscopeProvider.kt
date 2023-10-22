package com.aristidevs.horoscapp.data.providers

import com.aristidevs.horoscapp.domain.model.horoscopeInfo
import com.aristidevs.horoscapp.domain.model.horoscopeInfo.*
import javax.inject.Inject

class HoroscopeProvider @Inject constructor(){

    fun getHoroscope():List<horoscopeInfo>{
        return listOf(
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
}