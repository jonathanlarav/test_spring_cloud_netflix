package com.test.core.main.client.two.web;

import com.test.core.main.client.two.model.MessageRenderer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jonathanlara on 10/13/15.
 */
@RestController
public class ClientTwoResource {

    @RequestMapping("/message/renderer")
    public MessageRenderer displayMessage() {


        return new MessageRenderer(null);
    }
}
