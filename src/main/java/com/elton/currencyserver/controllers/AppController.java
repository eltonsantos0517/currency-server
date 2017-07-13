package com.elton.currencyserver.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by elton on 12/07/2017.
 */
public class AppController {

    @RequestMapping(method = RequestMethod.GET, value = "hello-word")
    public String helloWord(){
        return "Hello Word";
    }
}
