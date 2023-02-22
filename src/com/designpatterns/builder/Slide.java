package com.designpatterns.builder;

public class Slide {

    public String text;

    public Slide(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
