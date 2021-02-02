package com.marchalnicolas.androidcoroutineretrofitsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import kotlinx.android.synthetic.main.fragment_a.*

class FragmentA : Fragment() {
    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_a, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.responseLiveData.observe(viewLifecycleOwner, {
            textView.text = it.joinToString(separator = "\n")
        })
        viewModel.convertedNumberLiveData.observe(viewLifecycleOwner, {
            textView.text = it
        })

    }
}