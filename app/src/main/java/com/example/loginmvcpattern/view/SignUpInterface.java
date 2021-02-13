package com.example.loginmvcpattern.view;

import android.content.Context;

public interface SignUpInterface {
    interface View {
        void initViews();

        void showToast(boolean result);

        void setPresenter(SignUpInterface.Presenter presenter);
    }

    interface Presenter {
        void onAddDataClicked(String enterName, String enterPass);
    }
}
