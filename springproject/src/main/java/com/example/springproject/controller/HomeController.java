package com.example.springproject.controller;

import com.example.springproject.model.HelloModel;
import com.example.springproject.service.HelloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public @ResponseBody ResponseEntity<HelloModel> hello() {
        HelloModel helloDTO = helloService.hello();

        return ResponseEntity.ok().body(helloDTO);
    }
}
