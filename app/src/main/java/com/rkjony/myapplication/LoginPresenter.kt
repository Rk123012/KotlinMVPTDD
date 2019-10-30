package com.rkjony.myapplication

class LoginPresenter(private val view: LoginContractor.View) : LoginContractor.Presenter {

    private val model: LoginModel = LoginModel(view)

    override fun loginButtonPressed() {
        model.callLoginApi(view.getUserName(), view.getPassword())
    }

}