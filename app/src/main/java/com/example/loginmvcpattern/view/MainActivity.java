package com.example.loginmvcpattern.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.loginmvcpattern.R;
import com.example.loginmvcpattern.controller.LoginController;
import com.example.loginmvcpattern.model.InterfaceLoginModel;
import com.example.loginmvcpattern.model.LoginModel;

public class MainActivity extends AppCompatActivity implements LogInInterface.View {

    private static Context context;
    EditText enterName, enterPass;
    Button logIn, signUp;
    InterfaceLoginModel model = new LoginModel();
    private LogInInterface.Presenter presenter;

    public static Context getContext() {
        return context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = MainActivity.this;
        presenter = new LoginController(model,this);

        initViews();
    }

    @Override
    public void initViews() {
        enterName = findViewById(R.id.enter_name);
        enterPass = findViewById(R.id.enter_pass);
        logIn = findViewById(R.id.log_in);
        signUp =findViewById(R.id.sign_up);


        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                presenter.onLogInClicked(enterName.getText().toString(), enterPass.getText().toString());
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onSignUpClicked();
            }
        });
    }

    @Override
    public void showToast(boolean result) {
        if (result) {
            Toast.makeText(this, "Data validated! Login Successful", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Data not found", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void setPresenter(LogInInterface.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void goToSignUpPage() {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }

}