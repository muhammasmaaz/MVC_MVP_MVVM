package com.example.mvc_mvp_mvvm.mvp.ModelforMVP

import com.example.mvc_mvp_mvvm.mvp.ModelforMVP.IModelmvp.IModel
import com.example.mvc_mvp_mvvm.mvp.ModelforMVP.presenterinterface.IPresenter

class Architecturemodelmvp : IModel {
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