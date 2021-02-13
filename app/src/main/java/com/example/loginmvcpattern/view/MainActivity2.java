package com.example.loginmvcpattern.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.loginmvcpattern.R;
import com.example.loginmvcpattern.controller.SignUpController;
import com.example.loginmvcpattern.model.InterfaceLoginModel;
import com.example.loginmvcpattern.model.LoginModel;

public class MainActivity2 extends AppCompatActivity implements SignUpInterface.View {

    InterfaceLoginModel model = new LoginModel();
    EditText createName, createPass;
    Button createAcc;

    SignUpInterface.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        presenter = new SignUpController(model,this);
        initViews();
    }


    public void initViews() {
        createAcc = findViewById(R.id.create_acc);
        createName =findViewById(R.id.create_name);
        createPass =findViewById(R.id.create_pass);

        createAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onAddDataClicked(createName.getText().toString(), createPass.getText().toString());
            }
        });
    }

    @Override
    public void showToast(boolean result) {
        Toast.makeText(this, "Data Added Successfully", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setPresenter(SignUpInterface.Presenter presenter) {
        this.presenter = presenter;
    }


}