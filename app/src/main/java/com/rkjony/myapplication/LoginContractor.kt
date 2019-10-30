package com.rkjony.myapplication

class LoginContractor {
    interface View{
        fun getUserName(): String
        fun getPassword(): String
        fun showRight()
        fun showWrong()
    }

    interface Presenter{
        fun loginButtonPressed()

    }

    interface Model{
        fun callLoginApi(userName:String,password:String)
    }
}