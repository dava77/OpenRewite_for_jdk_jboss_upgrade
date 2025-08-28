package com.example.demo2.soap;

import jakarta.jws.WebService;
import java.time.LocalDateTime;

@WebService(endpointInterface = "com.example.demo.soap.SampleSoapService")
public class SampleSoapServiceImpl implements SampleSoapService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name + ", from Axis2 SOAP Service!";
    }

    @Override
    public String getServerTime() {
        return "Server Time: " + LocalDateTime.now();
    }
}