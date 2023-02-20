package com.designpatterns.chainOfResponsability;

public class Authenticator extends Handler {

    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        var isValid = (request.getUsername().equals("admin") &&
                request.getPassword().equals("123"));
        System.out.println("Authentication");
        return !isValid;
    }
}
