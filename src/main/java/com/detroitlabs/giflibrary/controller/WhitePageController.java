package com.detroitlabs.giflibrary.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WhitePageController implements ErrorController {

    private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public String error(){
        return "ERROR HANDLED";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}
