package com.designpatterns.bridge;

public class SonyTV implements Device{
    @Override
    public void turnOn() {
        System.out.println("Sony: turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: turnOff");
    }

    @Override
    public void setChannel(int n) {
        System.out.println("Sony: setChannel");
    }
}
