package com.designpatterns.abstractFactory.material;

import com.designpatterns.abstractFactory.TextBox;

public class MaterialTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Material TextBox");
    }
}
