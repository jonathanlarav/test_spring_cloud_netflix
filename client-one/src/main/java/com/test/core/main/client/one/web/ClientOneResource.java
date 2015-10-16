package com.test.core.main.client.one.web;

import com.test.core.main.client.one.model.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jonathanlara on 10/13/15.
 */
@RestController
public class ClientOneResource {

    @RequestMapping("/message/supplier")
    public Message home(@RequestParam("message") String message) {
        return new Message("hi, this is your message: " + message);
    }
}