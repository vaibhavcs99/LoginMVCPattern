package com.example.loginmvcpattern.model;

public interface InterfaceLoginModel {
    boolean validateData(String enterName, String enterPass);

    boolean addDataToPref(String createName, String createPass);
}
