package com.example.loginmvcpattern.controller;

import android.content.Context;

import com.example.loginmvcpattern.model.LoginModel;
import com.example.loginmvcpattern.view.ActivityTwoView;

public class SignUpController {
    ActivityTwoView view;
    LoginModel model;

    public SignUpController(ActivityTwoView view, LoginModel model) {
        this.view = view;
        this.model = model;
    }

    public void addDataToPref(Context context, String enterName, String enterPass) {
        boolean result = model.addDataToPref(context, enterName, enterPass);
        if (result) {
            view.showToast(result);
        }
    }
}
