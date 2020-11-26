package com.example.loginmvcpattern.controller;

import com.example.loginmvcpattern.model.InterfaceLoginModel;
import com.example.loginmvcpattern.model.LoginModel;
import com.example.loginmvcpattern.view.SignUpInterface;

public class SignUpController implements SignUpInterface.Presenter {
    InterfaceLoginModel model;
    SignUpInterface.View view;

    public SignUpController(InterfaceLoginModel model, SignUpInterface.View view) {
        this.model = model;
        this.view = view;
        view.setPresenter(this);
    }

    public void onAddDataClicked(String enterName, String enterPass) {
        boolean result = model.addDataToPref(enterName, enterPass);
        if (result) {
            view.showToast(result);
        }
    }
}
