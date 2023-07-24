package com.example.mvc_mvp_mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.mvc_mvp_mvvm.modelviewmodel.Model
import com.example.mvc_mvp_mvvm.modelviewmodel.ViewModel
import com.example.mvc_mvp_mvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//    var tv_mvc_mvp_mvvm:TextView?=null
//    var btn_mvc_mvp_mvvm:Button?=null
//    private lateinit var ipresenter: IPresenter
    lateinit var mBinding:ActivityMainBinding
    lateinit var modelview: ViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        tv_mvc_mvp_mvvm=findViewById(R.id.tv_MVC_MVP_MVVM)
//        btn_mvc_mvp_mvvm=findViewById(R.id.btn_MVC_MVP_MVVM)
////
//        ipresenter= Presenter(this, Architecturemodelmvp())
//        btn_mvc_mvp_mvvm?.setOnClickListener {
//            ipresenter.showpresenterarchtecture()

        //mvvm
        mBinding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        //////model
        val model= Model("MVVM")
        /////ViewModel
        modelview= ViewModel(model)
        ////binding
        mBinding.vm=modelview


    }

//    override fun showViewArchitecture(architecture: String) {
//        tv_mvc_mvp_mvvm?.text=architecture
//
//    }


}