package com.aristidevs.horoscapp.ui.home.horoscope

import androidx.lifecycle.ViewModel
import com.aristidevs.horoscapp.domain.model.horoscopeInfo
import com.aristidevs.horoscapp.domain.model.horoscopeInfo.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class horoscopeViewModel @Inject constructor():ViewModel(){

    private var _horoscope = MutableStateFlow<List<horoscopeInfo>>(emptyList())
    val horoscope:StateFlow<List<horoscopeInfo>> = _horoscope

    init {
        _horoscope.value = listOf(
            Aries, Taurus, Gemini
        )
    }

}