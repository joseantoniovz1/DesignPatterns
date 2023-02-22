package com.designpatterns.prototype;

public class ContextMenu {

    public void duplicate(Component component) {
        Component newComponent = component.clone();
    }
}
