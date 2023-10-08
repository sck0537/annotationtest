package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/quick",method = RequestMethod.GET)
    public String save(){
        System.out.println("controller save running");
        return "/jsp/success.jsp";

    }
}
