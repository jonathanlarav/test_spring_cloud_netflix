package com.test.core.main.client.two.model;

/**
 * Created by jonathanlara on 10/13/15.
 */
public class MessageRenderer {

    private String messageTemplate;

    public MessageRenderer(String messageTemplate) {
        this.messageTemplate = messageTemplate;
    }

    public String getMessageTemplate() {
        return messageTemplate;
    }

    public void setMessageTemplate(String messageTemplate) {
        this.messageTemplate = messageTemplate;
    }
}