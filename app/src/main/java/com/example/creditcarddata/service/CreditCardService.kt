package com.example.creditcarddata.service

import com.example.creditcarddata.model.CreditCardResponse
import retrofit2.http.GET

interface CreditCardService {
    @GET("credit_cards")
    suspend fun getCreditCards(): CreditCardResponse
}