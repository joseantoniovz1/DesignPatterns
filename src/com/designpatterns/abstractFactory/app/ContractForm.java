package com.designpatterns.abstractFactory.app;

import com.designpatterns.abstractFactory.WidgetFactory;

public class ContractForm {

    public void render(WidgetFactory factory) {
        factory.createTextBox().render();
        factory.createButton().render();
    }

}
