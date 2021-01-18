package com.marchalnicolas.androidcoroutineretrofitsample

import retrofit2.http.GET

interface TodoService {
    @GET("todos")
    suspend fun getTodo(): List<Todo>
}