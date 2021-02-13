package com.example.loginmvcpattern.model;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.loginmvcpattern.view.MainActivity;

public class LoginModel implements InterfaceLoginModel {

    private static final String MYPREF = "mypref";
    SharedPreferences sharedPreferences;

    @Override
    public boolean validateData(String enterName, String enterPass) {

        sharedPreferences = MainActivity.getContext().getSharedPreferences(MYPREF, Context.MODE_PRIVATE);
        String checkPassword = sharedPreferences.getString(enterName, "");


        if (enterPass.equals(checkPassword)) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean addDataToPref(String createName, String createPass) {
        sharedPreferences = MainActivity.getContext().getSharedPreferences(MYPREF, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(createName, createPass);
        editor.apply();
//        Toast.makeText(context, "Data Added Successfully", Toast.LENGTH_SHORT).show();
        return true;
    }
}
