package com.example.server_i18n.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestControler {

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/hello")
    public String hello(@RequestParam(value="key") String key) {

        String message = messageSource.getMessage(key, null, LocaleContextHolder.getLocale());

        return LocaleContextHolder.getLocale() + " : " + message;
    }

}
