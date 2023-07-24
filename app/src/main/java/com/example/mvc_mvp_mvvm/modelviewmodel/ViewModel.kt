package com.example.mvc_mvp_mvvm.modelviewmodel

import androidx.databinding.BaseObservable
import androidx.databinding.ObservableField

class ViewModel(private val model: Model) : BaseObservable() {

    //pass data to textview by using data binding
    val info= ObservableField<String>(model.architecture+"architecture")
    //pass fun on btn click listner
    fun architecture(){
        info.set(model.architecture+" worked")
    }


}