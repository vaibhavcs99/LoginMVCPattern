package com.example.loginmvcpattern.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.loginmvcpattern.R;
import com.example.loginmvcpattern.controller.LoginController;
import com.example.loginmvcpattern.model.LoginModel;

public class ActivityOneView {

    EditText enterName, enterPass;
    Button logIn, signUp;
    View rootView;
    LoginModel model;
    LoginController loginController;


    public ActivityOneView(Context context, ViewGroup viewGroup) {
        rootView = LayoutInflater.from(context).inflate(R.layout.activity_main, viewGroup);
        model = new LoginModel();
        loginController = new LoginController(model, this);

    }

    public void initViews(Context context) {
        enterName = rootView.findViewById(R.id.enter_name);
        enterPass = rootView.findViewById(R.id.enter_pass);
        logIn = rootView.findViewById(R.id.log_in);
        signUp = rootView.findViewById(R.id.sign_up);

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                loginController.validateData(context, enterName.getText().toString(), enterPass.getText().toString());
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginController.goToSignUpPage(context);
            }
        });
    }

    public void showToast(boolean result) {
        if (result) {
            Toast.makeText(rootView.getContext(), "Data validated! Login Successful", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(rootView.getContext(), "Data not found", Toast.LENGTH_SHORT).show();
        }
    }

    public View getRootView() {
        return this.rootView;
    }
}
