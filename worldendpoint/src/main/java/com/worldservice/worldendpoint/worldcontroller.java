package com.worldservice.worldendpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class worldcontroller {

    @GetMapping("/world")
    public String world(){
        return "World";
    }
}
