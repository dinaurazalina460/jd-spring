package com.cybertek.services;

import interfaces.Mentor;

public class PartTimeMentor implements Mentor {
    @Override
    public void createAccount() {
        System.out.println("PartTime Mentor account is created");
    }
}
