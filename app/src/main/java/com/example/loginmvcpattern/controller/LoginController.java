package com.example.loginmvcpattern.controller;

import android.content.Context;

import com.example.loginmvcpattern.model.InterfaceLoginModel;
import com.example.loginmvcpattern.model.LoginModel;
import com.example.loginmvcpattern.view.LogInInterface;

public class LoginController implements LogInInterface.Presenter {
    InterfaceLoginModel model;
    LogInInterface.View view;

    public LoginController(InterfaceLoginModel model, LogInInterface.View view) {
        this.model = model;
        this.view = view;
        view.setPresenter(this);
    }

    @Override
    public void onSignUpClicked() {
        view.goToSignUpPage();
    }

    @Override
    public void onLogInClicked( String enterName, String enterPass) {
        boolean result = model.validateData(enterName, enterPass);
        view.showToast(result);
    }



}
