package com.kkd.sbb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/ssb")
    @ResponseBody
    public String index(){
        return "안녕하세요 sbb에 오신 것을 환영합니다.";
    }
}