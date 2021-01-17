package com.rkjony.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(),LoginContractor.View{

    private lateinit var  loginPresenter:LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        loginPresenter = LoginPresenter(this)
        btn_login.setOnClickListener { loginPresenter.loginButtonPressed() }
    }

    override fun getUserName() : String{
       return ed_phone.text.toString()
    }

    override fun getPassword() : String{
       return ed_pass.text.toString()
    }

    override fun showRight() {
        Toast.makeText(this,"Login Successful",Toast.LENGTH_SHORT).show()
    }

    override fun showWrong() {
        Toast.makeText(this,"Login Failed",Toast.LENGTH_SHORT).show()
    }

}