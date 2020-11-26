package com.example.loginmvcpattern.view;

import android.content.Context;

public interface LogInInterface {
    interface View {
        void initViews();

        void showToast(boolean result);

        void setPresenter(LogInInterface.Presenter presenter);

        void goToSignUpPage();
    }

    interface Presenter {


        void onLogInClicked(String enterName, String enterPass);

        void onSignUpClicked();
    }
}
