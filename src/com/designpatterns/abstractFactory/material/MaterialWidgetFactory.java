package com.designpatterns.abstractFactory.material;

import com.designpatterns.abstractFactory.Button;
import com.designpatterns.abstractFactory.TextBox;
import com.designpatterns.abstractFactory.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MaterialTextBox();
    }
}
