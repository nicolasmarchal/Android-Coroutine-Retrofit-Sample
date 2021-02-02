package com.marchalnicolas.androidcoroutineretrofitsample.repo

import com.marchalnicolas.androidcoroutineretrofitsample.RetrofitManager
import com.marchalnicolas.androidcoroutineretrofitsample.models.Body
import com.marchalnicolas.androidcoroutineretrofitsample.models.Envelope
import com.marchalnicolas.androidcoroutineretrofitsample.models.NumberToWords
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

object NumberConversionRepository {
    suspend fun convertNumber(number: Int): String {
        return withContext(Dispatchers.IO) {
            RetrofitManager
                    .soapService
                    .numberConversion(Envelope(Body(NumberToWords(number))))
                    .body
                    .numberToWordsResponse
                    .numberToWordsResult
        }
    }
}