package com.example.loginmvcpattern.controller;

import android.content.Context;

import com.example.loginmvcpattern.model.LoginModel;

public class SignUpController {
    LoginModel model = new LoginModel();
    public void addDataToPref(Context context, String enterName, String enterPass) {
        model.addDataToPref(context,enterName,enterPass);
    }
}
