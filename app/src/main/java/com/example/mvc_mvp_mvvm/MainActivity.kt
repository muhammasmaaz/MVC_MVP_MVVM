package com.example.mvc_mvp_mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.mvc_mvp_mvvm.controller.Controller

class MainActivity : AppCompatActivity() {
    var tv_mvc_mvp_mvvm:TextView?=null
    var btn_mvc_mvp_mvvm:Button?=null
    lateinit var controller: Controller
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_mvc_mvp_mvvm=findViewById(R.id.tv_MVC_MVP_MVVM)
        btn_mvc_mvp_mvvm=findViewById(R.id.btn_MVC_MVP_MVVM)

        controller=Controller(this)
        btn_mvc_mvp_mvvm?.setOnClickListener {
            controller.showarchitecture()
        }
    }
}