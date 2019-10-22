package com.chaitu.spboot.ws.wssample.controlleres.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 */
@RestController
public class HelloController {

    @GetMapping("/")
    public String sayWelcome() {
        return "Welcome to WsSample";
    }
}