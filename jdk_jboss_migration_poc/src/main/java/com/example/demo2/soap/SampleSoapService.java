package com.example.demo2.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface SampleSoapService {

    @WebMethod
    String sayHello(String name);

    @WebMethod
    String getServerTime();
}