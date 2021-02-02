package com.marchalnicolas.androidcoroutineretrofitsample

import com.marchalnicolas.androidcoroutineretrofitsample.services.NumberConversionService
import com.marchalnicolas.androidcoroutineretrofitsample.services.TodoService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.simplexml.SimpleXmlConverterFactory

object RetrofitManager {

    private val httpClient = OkHttpClient.Builder().apply {
        addInterceptor(HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        })
    }.build()

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(httpClient)
        .build()

    val service: TodoService = retrofit.create(TodoService::class.java)

    private val xmlRetrofit = Retrofit.Builder()
            .baseUrl("https://www.dataaccess.com/webservicesserver/")
            .addConverterFactory(SimpleXmlConverterFactory.create())
            .client(httpClient)
            .build()

    val soapService: NumberConversionService = xmlRetrofit.create(NumberConversionService::class.java)
}