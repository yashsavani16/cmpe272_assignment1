package com.microservice.micro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mergeService {

    @GetMapping("/merge")
    public String merge(){
        return "Hello World";
    }
}
