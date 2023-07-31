package com.example.server_i18n.controller;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.RequestContextUtils;

@RestController
@RequestMapping("/test")
public class TestControler {

    @Autowired
    private MessageSource messageSource;

    @Autowired
    private HttpServletRequest request;


    @GetMapping("/hello")
    public String hello() {
        System.out.println(LocaleContextHolder.getLocale());
        String message = messageSource.getMessage("FileNotExistErrorMessage", null, LocaleContextHolder.getLocale());

        return message;
    }

}
