package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DevController {
    @RequestMapping("/adkkev")
    public String adddev(){
        return "u8uuh";
    }

    @RequestMapping("/send")
    public String send(){
        return "";
    }
}
