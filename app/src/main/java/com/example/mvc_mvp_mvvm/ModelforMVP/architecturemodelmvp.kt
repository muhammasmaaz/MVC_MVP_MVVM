package com.example.mvc_mvp_mvvm.ModelforMVP

import com.example.mvc_mvp_mvvm.IModelmvp.IModel
import com.example.mvc_mvp_mvvm.presenterinterface.IPresenter

class Architecturemodelmvp :IModel {
    lateinit var ipresenter: IPresenter

    override fun showmodelarchitecture() {

        val architecture="MVP"
        this.sendarchitecture(architecture)

    }
    fun sendarchitecture(architecturemvp:String)
    {
        ipresenter.whicharchiterture(architecturemvp)
    }
}