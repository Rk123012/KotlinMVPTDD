package com.rkjony.myapplication

class LoginPresenter(private val view: LoginContractor.View):LoginContractor.Presenter{

    override fun loginButtonPressed() {
        val name  = view.getUserName()
        val pass = view.getPassword()

        if (name == "123" && pass == "23"){
            view.showRight()
        }else{
            view.showWrong()
        }
    }

}