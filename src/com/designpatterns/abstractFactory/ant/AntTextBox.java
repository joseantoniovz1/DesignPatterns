package com.designpatterns.abstractFactory.ant;

import com.designpatterns.abstractFactory.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Ant TextBox");
    }
}
