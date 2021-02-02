package com.marchalnicolas.androidcoroutineretrofitsample.repo

import com.marchalnicolas.androidcoroutineretrofitsample.RetrofitManager
import com.marchalnicolas.androidcoroutineretrofitsample.models.Todo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

//Singleton object
object TodoRepository {

    suspend fun getTodo(): List<Todo> {
        return withContext(Dispatchers.IO) {
            RetrofitManager.service.getTodo()
        }
    }
}