package com.example.loginmvcpattern;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.loginmvcpattern.view.ActivityTwoView;

public class MainActivity2 extends AppCompatActivity {

    ActivityTwoView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view = new ActivityTwoView(this, null);
        setContentView(view.getRootView());
        view.initViews(this);
    }


    private void initViews() {
        // todo moved to viewTwo
    }

    private void addDataToPref() {
        //todo moved to model
    }


}