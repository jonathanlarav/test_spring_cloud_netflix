package com.test.web;

import com.test.model.Message;
import com.test.model.MessageRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by jonathanlara on 10/13/15.
 */
@RestController
public class ClientTwoResource {

    @Value("${I.am}")
    private String iAm;

    @Value("${I.have}")
    private String iHave;

    @Value("${I.look}")
    private String iLook;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/message/renderer")
    public MessageRenderer displayMessage(@RequestParam("msg") String message) {
        String url = "http://client-one/message/supplier?message=" + message;
        Message messageObject = restTemplate.getForObject(url, Message.class);

        return new MessageRenderer(messageObject);
    }

    @RequestMapping("/whatAmI")
    public String whatAmI() {
        return iAm + " and " + iHave + " and " + iLook;
    }
}
