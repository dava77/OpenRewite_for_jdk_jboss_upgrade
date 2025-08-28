package com.example.demo2.controller;

import com.example.demo2.dto.SampleDTO;
import com.example.demo2.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sample")
public class SampleController {

    @Autowired
    private SampleService service;

    @GetMapping("/{id}")
    public SampleDTO getSample(@PathVariable String id) {
        return service.getMessage(id);
    }
}