package com.marchalnicolas.androidcoroutineretrofitsample.services

import com.marchalnicolas.androidcoroutineretrofitsample.models.Envelope
import com.marchalnicolas.androidcoroutineretrofitsample.models.EnvelopeResponse
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface NumberConversionService {

    @Headers("Content-Type: text/xml")
    @POST("NumberConversion.wso")
    suspend fun numberConversion(@Body envelope: Envelope): EnvelopeResponse
}