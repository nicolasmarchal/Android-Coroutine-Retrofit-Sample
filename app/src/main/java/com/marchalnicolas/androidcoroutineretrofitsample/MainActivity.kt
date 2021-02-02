package com.marchalnicolas.androidcoroutineretrofitsample

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    val TAG = MainActivity::class.java.simpleName

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.responseLiveData.observe(this, {
            Log.d(TAG, it.joinToString(separator = "\n"))
        })
    }
}