package com.Udemy.Udemy.basics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Learning {


        @GetMapping ("/")
        public String index() {
                return "Greetings from Spring Boot!";
        }

}