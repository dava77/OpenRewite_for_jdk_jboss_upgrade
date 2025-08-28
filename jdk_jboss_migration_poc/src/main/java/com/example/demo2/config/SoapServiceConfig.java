package com.example.demo2.config;

import com.example.demo2.soap.SampleSoapServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jakarta.xml.ws.Endpoint;

@Configuration
public class SoapServiceConfig {

    @Bean
    public Endpoint soapEndpoint() {
        return Endpoint.publish("/ws/sample", new SampleSoapServiceImpl());
    }
}