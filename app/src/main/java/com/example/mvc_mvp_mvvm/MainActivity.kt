package com.example.mvc_mvp_mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.mvc_mvp_mvvm.ModelforMVP.Architecturemodelmvp
import com.example.mvc_mvp_mvvm.Presenterclass.Presenter
import com.example.mvc_mvp_mvvm.presenterinterface.IPresenter
import com.example.mvc_mvp_mvvm.viewinterfaces.IViewInterface

class MainActivity : AppCompatActivity(),Presenter.IPresenter {
    var tv_mvc_mvp_mvvm:TextView?=null
    var btn_mvc_mvp_mvvm:Button?=null
    private lateinit var ipresenter:Presenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_mvc_mvp_mvvm=findViewById(R.id.tv_MVC_MVP_MVVM)
        btn_mvc_mvp_mvvm=findViewById(R.id.btn_MVC_MVP_MVVM)
//
//        ipresenter= Presenter(this,Architecturemodelmvp())

        ipresenter = Presenter(this);
        btn_mvc_mvp_mvvm?.setOnClickListener {
            ipresenter.getarchitecture("TEST")

        }
    }

//    override fun showViewArchitecture(architecture: String) {
//        tv_mvc_mvp_mvvm?.text=architecture
//
//    }

    override fun whicharchiterture(architecture: String) {
        tv_mvc_mvp_mvvm?.text=architecture

    }


}