package org.example.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.domain.User;
import org.example.domain.VO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {


    @RequestMapping(value = "/quick", method = RequestMethod.GET)
    public String save() {
        System.out.println("controller save running");
        return "/jsp/success.jsp";
    }

    @RequestMapping(value = "/quick2")
    public ModelAndView save2() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("username", "sds");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping(value = "/quick3")
    public ModelAndView save3(ModelAndView modelAndView) {
        modelAndView.addObject("username", "sds");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping(value = "/quick4")
    public String save4(Model model) {
        model.addAttribute("username", "sds");
        return "success";
    }

    @RequestMapping(value = "/quick5")
    public String save5(HttpServletRequest request) {//不常用
        request.setAttribute("username", "httpreq");
        return "success";
    }

    @RequestMapping(value = "/quick6")

    public void save6(HttpServletResponse response) throws IOException {//不常用
        response.getWriter().print("writer");
    }

    @RequestMapping(value = "/quick7")
    @ResponseBody
    public String save7() throws IOException {//不常用
        return "777";
    }


    @RequestMapping(value = "/quick8")
    @ResponseBody
    public String save8() throws IOException {
//        return "{\"username\":\"777\" \"age\":18}";

        User user = new User();
        user.setUsername("s");
        user.setAge(32);
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);
        return json;


    }

    @RequestMapping(value = "/quick10")
    @ResponseBody
    public User save10() {
        User user = new User();
        user.setUsername("s");
        user.setAge(29);
        return user;

    }

    @RequestMapping(value = "/quick11")
    @ResponseBody
    public void save11(String username, int age) {
        System.out.println(username);
        System.out.println(age);

    }

    @RequestMapping(value = "/quick12")
    @ResponseBody
    public void save12(String username, int age) {
        System.out.println(username);
        System.out.println(age);

    }

    @RequestMapping(value = "/quick13")
    @ResponseBody
    public void save13(User user) {
        System.out.println(user);

    }

    @RequestMapping(value = "/quick14")
    @ResponseBody
    public void save14(String[] strs) {
        System.out.println(Arrays.asList(strs));

    }

    @RequestMapping(value = "/quick15")
    @ResponseBody
    public void save15(VO vo) {
        System.out.println(vo);;
    }
}
