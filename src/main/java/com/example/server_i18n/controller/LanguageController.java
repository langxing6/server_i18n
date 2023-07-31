package com.example.server_i18n.controller;

import com.example.server_i18n.util.LanguageUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ijiangtao.net
 */
@Controller
public class LanguageController {

    @GetMapping("/lang/current")
    @ResponseBody
    public String currentLanguage(){
        return LanguageUtil.getCurrentLang();
    }
}
