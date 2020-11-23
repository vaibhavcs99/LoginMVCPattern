package com.example.loginmvcpattern.controller;

import android.content.Context;

import com.example.loginmvcpattern.model.LoginModel;

public class LoginController {
    LoginModel model = new LoginModel();

    public void validateData(Context context,String enterName,String enterPass) {
        model.validateData(context,enterName,enterPass);
    }

    public void goToSignUpPage(Context context) {
        model.goToSignUpPage(context);
    }
}
