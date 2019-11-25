package com.example.hello.ui.listemission

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ListeMissionViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Missions disponibles"
    }
    val text: LiveData<String> = _text
}