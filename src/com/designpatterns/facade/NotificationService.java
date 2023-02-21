package com.designpatterns.facade;

public class NotificationService {

    public void send(String message, String target) {
        var server = new NotificationServer();
        var connect = server.connect("123.546");
        var authToken = server.authenticate("appId", "key");
        server.send(authToken, new Message(message), "target");
    }

}
