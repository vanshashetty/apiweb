package com.APIweb.apiweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.ObjectMapper; // Add this import

@RestController
public class BooksController {

    @GetMapping("/hello")
    public String sayHello() throws Exception {
        String response = new RestTemplate().getForObject("https://openlibrary.org/subjects/science_fiction.json?limit=5", String.class);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(mapper.readTree(response)); // Pretty-print JSON
    }
}
