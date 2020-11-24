package com.example.loginmvcpattern.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.loginmvcpattern.R;
import com.example.loginmvcpattern.controller.SignUpController;
import com.example.loginmvcpattern.model.LoginModel;

public class ActivityTwoView {
    View rootView;
    LoginModel model;
    SignUpController controller;
    EditText createName, createPass;
    Button createAcc;

    public ActivityTwoView(Context context, ViewGroup viewGroup) {
        rootView = LayoutInflater.from(context).inflate(R.layout.activity_main2, viewGroup);
        model = new LoginModel();
        controller = new SignUpController(this,model);
    }

public void initViews(Context context) {
        createAcc = rootView.findViewById(R.id.create_acc);
        createName = rootView.findViewById(R.id.create_name);
        createPass = rootView.findViewById(R.id.create_pass);

        createAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controller.addDataToPref(context,createName.getText().toString(),createPass.getText().toString());
            }
        });
    }
public void showToast(boolean result){
        if(result){
            Toast.makeText(rootView.getContext(), "Data added Successfully", Toast.LENGTH_SHORT).show();
        }
}
    public View getRootView() {
        return this.rootView;
    }
}
