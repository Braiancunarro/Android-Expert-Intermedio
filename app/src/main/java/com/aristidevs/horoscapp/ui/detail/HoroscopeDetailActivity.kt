package com.aristidevs.horoscapp.ui.detail

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.navArgs
import com.aristidevs.horoscapp.R
import com.aristidevs.horoscapp.databinding.ActivityHoroscopeDetailBinding
import com.aristidevs.horoscapp.domain.model.HoroscopeModel
import com.aristidevs.horoscapp.domain.model.HoroscopeModel.*
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint

class HoroscopeDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHoroscopeDetailBinding
    private val horoscopeDetailViewModel: HoroscopeDetailViewModel by viewModels()

    private val args: HoroscopeDetailActivityArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHoroscopeDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        horoscopeDetailViewModel.getHoroscope(args.type)
        initIU()
    }

    private fun initIU() {
        initListener()
        initIUState()
    }

    private fun initListener() {
        binding.ivBack.setOnClickListener{ onBackPressed()}
    }

    private fun initIUState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                horoscopeDetailViewModel.state.collect {
                    when (it) {
                        is HoroscopeDetailState.Error -> errorState()
                        HoroscopeDetailState.Loading -> loadingState()
                        is HoroscopeDetailState.Success -> successState(it)
                    }
                }
            }
        }
    }

    private fun loadingState() {
       binding.pb.isVisible = true
    }
    private fun errorState(){
        binding.pb.isVisible = false

       binding.ivError
        binding.tvError

    }
    private fun successState(state: HoroscopeDetailState.Success) {
    binding.pb.isVisible = false

        val title = when(state.horoscopeModel){
            Aries -> R.string.aries
            Taurus -> R.string.taurus
            Gemini -> R.string.gemini
            Cancer -> R.string.cancer
            Leo -> R.string.leo
            Virgo -> R.string.virgo
            Libra -> R.string.libra
            Scorpio -> R.string.scorpio
            Sagittarius -> R.string.sagittarius
            Capricorn -> R.string.capricorn
            Aquarius -> R.string.aquarius
            Pisces -> R.string.pisces
        }
        binding.tvTitle.setText(title)




        //   binding.tvTitle.text = state.sing
        //binding.tvBody.text = state.prediction

         val image = when(state.horoscopeModel){
            Aries -> R.drawable.detail_aries
            Taurus -> R.drawable.detail_taurus
            Gemini -> R.drawable.detail_gemini
            Cancer -> R.drawable.detail_cancer
            Leo -> R.drawable.detail_leo
            Virgo -> R.drawable.detail_virgo
            Libra -> R.drawable.detail_libra
            Scorpio -> R.drawable.detail_scorpio
            Sagittarius -> R.drawable.detail_sagittarius
            Capricorn -> R.drawable.detail_capricorn
            Aquarius -> R.drawable.detail_aquarius
            Pisces -> R.drawable.detail_pisces
        }
        binding.ivDetail.setImageResource(image)
    }
}