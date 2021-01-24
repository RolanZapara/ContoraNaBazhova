package com.example.foodProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MainPageController {
    @GetMapping() //baseUrl => localhost:8080
    public String mainPage(
            @RequestParam(name = "name", required = false, defaultValue = "friend") String name,
            Map<String, Object> model) { //model it is an object that we send for user
        model.put("name", name);
        return "mainPage";
    }

    @GetMapping("/contacts") //baseUrl + endpoint => localhost:8080/contacts
    public String contacts(Map<String, Object> model) {
        model.put("some", "hello, we are coding");
        return "contacts";
    }
}
