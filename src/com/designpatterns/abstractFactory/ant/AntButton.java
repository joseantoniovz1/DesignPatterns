package com.designpatterns.abstractFactory.ant;

import com.designpatterns.abstractFactory.Button;

public class AntButton implements Button {
    @Override
    public void render() {
        System.out.println("Ant Button");
    }
}
