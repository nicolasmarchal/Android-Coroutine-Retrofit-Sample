package com.marchalnicolas.androidcoroutineretrofitsample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    val responseLiveData = MutableLiveData<List<Todo>>()

    fun loadContent() = viewModelScope.launch {
        responseLiveData.postValue(TodoRepository.getTodo())
    }
}