package org.example.web;

import org.example.config.SpringConfiguration;
import org.example.service.UserService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    public static void main(String[] args) {
//        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
//
        ApplicationContext app=new AnnotationConfigApplicationContext(SpringConfiguration.class);
//

        UserService userService=app.getBean(UserService.class);
        userService.save();

    }










    }

