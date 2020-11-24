package com.example.loginmvcpattern.controller;

import android.content.Context;

import com.example.loginmvcpattern.model.LoginModel;
import com.example.loginmvcpattern.view.ActivityOneView;
import com.example.loginmvcpattern.view.ActivityTwoView;

public class LoginController {
    LoginModel model ;
    ActivityOneView view;

    public LoginController(LoginModel model, ActivityOneView view) {
        this.model = model;
        this.view = view;
    }

    public void validateData(Context context, String enterName, String enterPass) {
       boolean result = model.validateData(context,enterName,enterPass);
       if(result){
           view.showToast(result);
       }
    }

    public void goToSignUpPage(Context context) {
        model.goToSignUpPage(context);
    }
}
