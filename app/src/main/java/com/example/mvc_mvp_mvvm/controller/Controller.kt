package com.example.mvc_mvp_mvvm.controller

import com.example.mvc_mvp_mvvm.MainActivity
import com.example.mvc_mvp_mvvm.Modelclass.ArcitectureModel

class Controller( var mainActivity: MainActivity) {
    var model:ArcitectureModel = ArcitectureModel(this)

    fun showarchitecture(){
        model.showarchitecture()
    }
    fun receivefromcontroller(modelname:String){
        mainActivity.tv_mvc_mvp_mvvm?.text= modelname
    }
}