package com.example.demo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
//    @GetMapping("/")
//    public String index() {
//        return "index";
//    }
//
//    @PostMapping("/submit")
//    public String handleSubmit(@RequestParam String name, Model model) {
//        model.addAttribute("greeting", "Hello, " + name + "!"
//        );
//        return "result";

    @Value("${app.name}")
    private String appName;

    @GetMapping("/app-name")
    public String getAppName() {
        return "Application Name: " + appName;
    }
}

