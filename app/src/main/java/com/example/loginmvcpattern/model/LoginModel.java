package com.example.loginmvcpattern.model;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.loginmvcpattern.MainActivity2;

public class LoginModel {

    private static final String MYPREF = "mypref";
    EditText enterName, enterPass;
    Button logIn, signUp;
    SharedPreferences sharedPreferences;

    public void validateData(Context context,String enterName,String enterPass) {

        sharedPreferences = context.getSharedPreferences(MYPREF, Context.MODE_PRIVATE);
        String checkPassword = sharedPreferences.getString(enterName, "");

        if (enterPass.equals(checkPassword)) {
            Toast.makeText(context, "Data Exists, Login Successful", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Data not found", Toast.LENGTH_SHORT).show();
        }

    }
    public void goToSignUpPage(Context context) {
        Intent intent = new Intent(context, MainActivity2.class);
        context.startActivity(intent);
    }

    public void addDataToPref(Context context,String createName,String createPass) {
        sharedPreferences = context.getSharedPreferences(MYPREF, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(createName, createPass);
        editor.apply();
        Toast.makeText(context, "Data Added Successfully", Toast.LENGTH_SHORT).show();
    }
}
