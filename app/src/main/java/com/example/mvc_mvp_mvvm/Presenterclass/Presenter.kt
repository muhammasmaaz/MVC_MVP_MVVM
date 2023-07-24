package com.example.mvc_mvp_mvvm.Presenterclass

import com.example.mvc_mvp_mvvm.IModelmvp.IModel
import com.example.mvc_mvp_mvvm.ModelforMVP.Architecturemodelmvp
import com.example.mvc_mvp_mvvm.presenterinterface.IPresenter
import com.example.mvc_mvp_mvvm.viewinterfaces.IViewInterface


class Presenter(ipresenter: IPresenter) {

    private var ipresenter: IPresenter? = null
    private var architecture: Architecturemodelmvp = Architecturemodelmvp()


    init {
        this.ipresenter=ipresenter
    }
//    fun showarchitecture(architecture: String?) {
//
//        if (architecture != null) {
//            ipresenter?.whicharchiterture()
//        }
//
//    }
    fun getarchitecture(architectur: String) {
        ipresenter?.whicharchiterture(architecture.getmodelarchitecture())
    }



    interface IPresenter {
        fun whicharchiterture(architecture: String)
//        fun showpresenterarchtecture()

    }

}