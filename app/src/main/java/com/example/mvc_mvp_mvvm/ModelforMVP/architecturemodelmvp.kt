package com.example.mvc_mvp_mvvm.ModelforMVP

import com.example.mvc_mvp_mvvm.IModelmvp.IModel
import com.example.mvc_mvp_mvvm.presenterinterface.IPresenter

class Architecturemodelmvp {
    var architecture="MVP"
    fun setmodelarchitecture(architecture:String) {

        this.architecture=architecture


    }
    fun getmodelarchitecture(): String {
        return architecture
    }

}