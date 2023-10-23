package com.aristidevs.horoscapp.domain.usecase

import com.aristidevs.horoscapp.domain.model.Repository
import javax.inject.Inject

class GetPredictionUseCase @Inject constructor(private var repository: Repository) {

    suspend operator fun invoke(sign:String) = repository.getPrediction(sign)
}