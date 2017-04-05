package com.sanchay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sanchay on 4/3/17.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home() {
        return "test";
    }


}