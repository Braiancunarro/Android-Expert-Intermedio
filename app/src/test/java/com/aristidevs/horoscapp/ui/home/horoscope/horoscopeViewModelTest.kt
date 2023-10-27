package com.aristidevs.horoscapp.ui.home.horoscope

import com.aristidevs.horoscapp.data.providers.HoroscopeProvider
import com.aristidevs.horoscapp.motherobject.HoroscopeMotherObject.horoscopeInfoList
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class horoscopeViewModelTest{

    @MockK
    lateinit var horoscopeProvider: HoroscopeProvider

    private lateinit var viewModel: horoscopeViewModel

    @Before
    fun setUp(){
            MockKAnnotations.init(this, relaxUnitFun = true)
    }

    @Test
    fun `when viewmodel is created then horoscopes are loaded`(){
        every { horoscopeProvider.getHoroscope() } returns horoscopeInfoList
        viewModel = horoscopeViewModel(horoscopeProvider)

        val horoscopes = viewModel.horoscope.value

        assertTrue(horoscopes.isNotEmpty())
    }
}

