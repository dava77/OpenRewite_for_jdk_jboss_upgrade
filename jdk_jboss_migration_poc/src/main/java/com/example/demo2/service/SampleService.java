package com.example.demo2.service;

import com.example.demo2.dto.SampleDTO;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

    public SampleDTO getMessage(String id) {
        return new SampleDTO(id, "Hello from Service Layer with ID: " + id);
    }
}