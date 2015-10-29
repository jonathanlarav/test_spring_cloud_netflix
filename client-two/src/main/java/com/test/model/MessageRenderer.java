package com.test.model;

/**
 * Created by jonathanlara on 10/13/15.
 */
public class MessageRenderer {

    private Message message;

    public MessageRenderer(Message message) {
        this.message = message;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}