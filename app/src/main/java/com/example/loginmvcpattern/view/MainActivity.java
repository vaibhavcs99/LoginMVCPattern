package com.example.loginmvcpattern;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.loginmvcpattern.view.ActivityOneView;

public class MainActivity extends AppCompatActivity {
    ActivityOneView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view = new ActivityOneView(this, null);
        setContentView(view.getRootView());

        view.initViews(this);
    }

    private void validateData() {
//todo moved to model

    }

    private void goToSignUpPage() {
//todo moved to model
    }

    private void initViews() {
//todo moved to activity one view
    }


}