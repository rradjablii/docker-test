package com.rradjabli.spring.micro.dockertest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/controller")
public class Controller {

    @GetMapping("/test")
    public ResponseEntity<String> testing(){
        return ResponseEntity.ok("testing successful");
    }

}
