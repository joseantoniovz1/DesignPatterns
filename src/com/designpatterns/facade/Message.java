package com.designpatterns.facade;

public class Message {

    public String getMessage() {
        return message;
    }

    private String message;

    public Message(String message) {
        this.message = message;
    }


}
