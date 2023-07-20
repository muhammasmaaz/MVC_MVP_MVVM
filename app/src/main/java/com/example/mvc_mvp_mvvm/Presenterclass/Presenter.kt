package com.example.mvc_mvp_mvvm.Presenterclass

import com.example.mvc_mvp_mvvm.IModelmvp.IModel
import com.example.mvc_mvp_mvvm.presenterinterface.IPresenter
import com.example.mvc_mvp_mvvm.viewinterfaces.IViewInterface

class Presenter(var view:IViewInterface,var model:IModel):IPresenter{
    override fun whicharchiterture(architecture: String) {
        view.showViewArchitecture(architecture)
    }

    override fun showpresenterarchtecture() {

        this.model.showmodelarchitecture()
    }


}