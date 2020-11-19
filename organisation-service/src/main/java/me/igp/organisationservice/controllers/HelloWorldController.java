package me.igp.organisationservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String getHelloName(@RequestParam(defaultValue = "world") String name) {
        return "Hello " + name + "!";
    }

    @GetMapping("/pineapple")
    public String pineapples() {
        return "Pineapples!";
    }
}
