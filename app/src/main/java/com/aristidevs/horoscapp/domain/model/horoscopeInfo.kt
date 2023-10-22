package com.aristidevs.horoscapp.domain.model

import com.aristidevs.horoscapp.R

sealed class horoscopeInfo(val img:Int, val name:Int){
    object Aries:horoscopeInfo(R.drawable.aries, R.string.aries)
    object Taurus:horoscopeInfo(R.drawable.tauro, R.string.taurus)
    object Gemini:horoscopeInfo(R.drawable.geminis, R.string.gemini)
    object Cancer:horoscopeInfo(R.drawable.cancer, R.string.cancer)
    object Leo:horoscopeInfo(R.drawable.leo, R.string.leo)
    object Virgo:horoscopeInfo(R.drawable.virgo, R.string.virgo)
    object Libra:horoscopeInfo(R.drawable.libra, R.string.libra)
    object Scorpio:horoscopeInfo(R.drawable.escorpio, R.string.scorpio)
    object Sagittarius:horoscopeInfo(R.drawable.sagitario, R.string.sagittarius)
    object Capricorn:horoscopeInfo(R.drawable.capricornio, R.string.capricorn)
    object Aquarius:horoscopeInfo(R.drawable.aquario, R.string.aquarius)
    object Pisces:horoscopeInfo(R.drawable.piscis, R.string.pisces)
}

