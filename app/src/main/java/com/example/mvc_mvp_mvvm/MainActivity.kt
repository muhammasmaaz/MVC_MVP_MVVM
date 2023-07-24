package com.example.mvc_mvp_mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.mvc_mvp_mvvm.modelviewmodel.Model
import com.example.mvc_mvp_mvvm.modelviewmodel.ViewModel
import com.example.mvc_mvp_mvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mBinding:ActivityMainBinding
    lateinit var modelview: ViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //mvvm
        mBinding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        //////model
        val model= Model("MVVM")
        /////ViewModel
        modelview= ViewModel(model)
        ////binding
        mBinding.vm=modelview


    }



}