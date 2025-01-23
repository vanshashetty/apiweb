package com.APIweb.apiweb;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return new RestTemplate().getForObject("https://openlibrary.org/subjects/science_fiction.json?limit=5", String.class);
    }
}

