package com.marchalnicolas.androidcoroutineretrofitsample

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

//Singleton object
object TodoRepository {

    suspend fun getTodo(): List<Todo> = withContext(Dispatchers.IO) {
        RetrofitManager.service.getTodo()
    }
}