package com.test.core.main.client.one.web;

import com.test.core.main.client.one.model.Message;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jonathanlara on 10/13/15.
 */
@RestController
public class ClientOneResource {

    @Value("${I.am}")
    private String iAm;

    @Value("${I.have}")
    private String iHave;

    @Value("${I.look}")
    private String iLook;

    @RequestMapping("/message/supplier")
    public Message home(@RequestParam("message") String message) {
        return new Message("Hello, this is your Message: " + message);
    }

    @RequestMapping("/whatAmI")
    public String whatAmI() {
        return iAm + " and " + iHave + " and " + iLook;
    }
}