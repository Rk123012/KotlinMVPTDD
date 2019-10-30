package com.rkjony.myapplication

class LoginModel(private val view: LoginContractor.View) : LoginContractor.Model {

    override fun callLoginApi(userName: String, password: String) {
        if (userName == "123" && password == "23") {
            view.showRight()
        } else {
            view.showWrong()
        }
    }

}