package com.example.wholewebsite.contact.controller;

import com.example.wholewebsite.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
public class ContactController {

    @Autowired
    ContactService service;

    @PostMapping("/subscribe")
    public String subscribe(@RequestParam HashMap<String, String> param){
        service.insertSubscribe(param);
        return param.get("url");
    }

    @PostMapping("/requestCall")
    public String requestCall(@RequestParam HashMap<String,String> param){
        service.insertContact(param);
        return "redirect:/";
    }
}
