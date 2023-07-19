package com.example.mvc_mvp_mvvm.Modelclass

import com.example.mvc_mvp_mvvm.controller.Controller

class ArcitectureModel(var controller: Controller) {
    var architecture= "MVC"
    fun showarchitecture(){
        val mvc=architecture
        sendtocontroller(mvc)
    }

    private fun sendtocontroller(mvc: String) {

        controller.receivefromcontroller(mvc)
    }
}