package com.rarmash.prac3.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rarmash.prac3.R

class FirstFragmentViewModel: ViewModel() {
    val _currentImage = MutableLiveData<Int>(R.drawable.asuka)
    private var imageChanged = false

    fun changeImage() {
        if (!imageChanged) {
            _currentImage.value = R.drawable.shinji
            imageChanged = true
        } else {
            _currentImage.value = R.drawable.asuka
            imageChanged = false
        }
    }
}