package com.example.springproject.service;

import java.sql.Timestamp;

import com.example.springproject.model.HelloModel;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public HelloModel hello() {
        HelloModel helloDTO = new HelloModel();
        helloDTO.setHello("Ciao");
        helloDTO.setTimestamp(new Timestamp(System.currentTimeMillis()));
        return helloDTO;
    }
}
