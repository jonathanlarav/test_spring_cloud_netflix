package com.test.core.main.client.two.web;

import com.test.core.main.client.two.model.Message;
import com.test.core.main.client.two.model.MessageRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by jonathanlara on 10/13/15.
 */
@RestController
public class ClientTwoResource {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/message/renderer")
    public MessageRenderer displayMessage(@RequestParam("msg") String message) {
        System.out.println(message);
        String url = "http://client-one/message/supplier?" + message;
        System.out.println(url);
        Message messageObject = restTemplate.getForObject(url, Message.class);

        return new MessageRenderer(messageObject);
    }
}
