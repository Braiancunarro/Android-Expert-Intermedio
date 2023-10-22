package com.aristidevs.horoscapp.domain.model

import com.aristidevs.horoscapp.R

sealed class horoscopeInfo(val img:Int, val name:Int){
    data object Aries:horoscopeInfo(R.drawable.aries, R.string.aries)
    data  object Taurus:horoscopeInfo(R.drawable.tauro, R.string.taurus)
    data object Gemini:horoscopeInfo(R.drawable.geminis, R.string.gemini)
    data object Cancer:horoscopeInfo(R.drawable.cancer, R.string.cancer)
    data object Leo:horoscopeInfo(R.drawable.leo, R.string.leo)
    data object Virgo:horoscopeInfo(R.drawable.virgo, R.string.virgo)
    data object Libra:horoscopeInfo(R.drawable.libra, R.string.libra)
    data object Scorpio:horoscopeInfo(R.drawable.escorpio, R.string.scorpio)
    data object Sagittarius:horoscopeInfo(R.drawable.sagitario, R.string.sagittarius)
    data object Capricorn:horoscopeInfo(R.drawable.capricornio, R.string.capricorn)
    data object Aquarius:horoscopeInfo(R.drawable.aquario, R.string.aquarius)
    data object Pisces:horoscopeInfo(R.drawable.piscis, R.string.pisces)
}

