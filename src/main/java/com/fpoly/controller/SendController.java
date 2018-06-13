package com.fpoly.controller;

import com.fpoly.model.Mail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import javax.mail.internet.MimeMessage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SendController {
    @RequestMapping("mail")
    public String index() {
        return "mail/form";
    }

    @Autowired
    Mail mail;


    @RequestMapping("send")
    public String sendMail(
            @RequestParam("from") String from,
            @RequestParam("to") String to,
            @RequestParam("subject") String subject,
            @RequestParam("body") String body, ModelMap model
    ) {
        try {
            mail.send(from, to, subject, body);
            model.addAttribute("message", "Send Mail Success!");
        } catch (Exception e) {
            System.out.println(e);
            model.addAttribute("message", "Send Mail Fail!");
        }
        return "mail/form";
    }

}


