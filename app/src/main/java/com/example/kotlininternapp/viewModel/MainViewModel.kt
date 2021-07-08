package com.example.kotlininternapp.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kotlininternapp.model.Finder

class MainViewModel():ViewModel() {



    private var _mutableLiveData = MutableLiveData<String>()
    val liveData: LiveData<String> = _mutableLiveData


    fun add(newString: String){
        val finder = Finder(newString)
        _mutableLiveData.value = finder.find()

    }

    init {
        Log.i("MainViewModel", "MainViewModel created!")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("MainViewModel", "MainViewModel destroyed!")
    }



}