package com.example.driver;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Value;

@RestController
@RequestMapping("/drivers")
public class DriverController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Driver Service. Port: " + port;
    }

    @GetMapping("/info")
    public String info() {
        return "Driver Management System running on port: " + port;
    }
}