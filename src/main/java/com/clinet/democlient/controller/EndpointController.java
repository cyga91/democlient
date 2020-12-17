package com.clinet.democlient.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endpoint")
public class EndpointController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public String testEndpoint() {
        return "Hello world";
    }
}
