package com.marchalnicolas.androidcoroutineretrofitsample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.marchalnicolas.androidcoroutineretrofitsample.models.Todo
import com.marchalnicolas.androidcoroutineretrofitsample.repo.NumberConversionRepository
import com.marchalnicolas.androidcoroutineretrofitsample.repo.TodoRepository
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    val responseLiveData = MutableLiveData<List<Todo>>()

    val convertedNumberLiveData = MutableLiveData<String>()


    fun loadContent() = viewModelScope.launch {
        responseLiveData.postValue(TodoRepository.getTodo())
    }

    fun convertNumber(number: Int) = viewModelScope.launch {
        convertedNumberLiveData.postValue( NumberConversionRepository.convertNumber(number))
    }
}