package com.fpoly.controller;

import com.fpoly.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    User user;

    @RequestMapping("/index")
    public String index(ModelMap model) {
        return "/home";
    }

    @ModelAttribute("user")
    public User getUser() {
        return user;
    }
}
