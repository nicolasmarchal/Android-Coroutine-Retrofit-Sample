package com.marchalnicolas.androidcoroutineretrofitsample.services

import com.marchalnicolas.androidcoroutineretrofitsample.models.Todo
import retrofit2.http.GET

interface TodoService {
    @GET("todos")
    suspend fun getTodo(): List<Todo>
}