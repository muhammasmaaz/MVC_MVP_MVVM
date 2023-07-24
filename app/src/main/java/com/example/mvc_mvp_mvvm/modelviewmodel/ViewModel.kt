package com.example.mvc_mvp_mvvm.modelviewmodel

import androidx.databinding.BaseObservable
import androidx.databinding.ObservableField

class ViewModel(private val model: Model) : BaseObservable() {

    val info= ObservableField<String>(model.architecture+"architecture")
    fun architecture(){
        info.set(model.architecture+" worked")
    }


}