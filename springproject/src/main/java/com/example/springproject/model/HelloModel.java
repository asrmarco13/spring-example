package com.example.springproject.model;

import java.sql.Timestamp;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString
public class HelloModel {
    private String hello;
    private Timestamp timestamp;
}
