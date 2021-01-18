package com.marchalnicolas.androidcoroutineretrofitsample

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            viewModel.loadContent()
        }

        viewModel.responseLiveData.observe(this, {
            textView.text = it.joinToString(separator = "\n")
        })
    }
}