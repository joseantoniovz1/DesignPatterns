package com.designpatterns.abstractFactory.material;

import com.designpatterns.abstractFactory.Button;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("Material Button");
    }
}
