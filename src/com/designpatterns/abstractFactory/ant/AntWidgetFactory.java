package com.designpatterns.abstractFactory.ant;

import com.designpatterns.abstractFactory.Button;
import com.designpatterns.abstractFactory.TextBox;
import com.designpatterns.abstractFactory.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AntTextBox();
    }
}
