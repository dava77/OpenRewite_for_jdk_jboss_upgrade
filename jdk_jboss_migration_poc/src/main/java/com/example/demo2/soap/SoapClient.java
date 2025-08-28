package com.example.demo2.soap;

import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;

import java.net.URI;
import java.net.URL;

public class SoapClient {

    public static void main(String[] args) throws Exception {
        URL wsdlURL = URI.create("http://localhost:8080/ws/sample?wsdl").toURL();

        QName qname = new QName("http://soap.demo.example.com/", "SampleSoapServiceImplService");
        Service service = Service.create(wsdlURL, qname);

        SampleSoapService soapService = service.getPort(SampleSoapService.class);

        System.out.println(soapService.sayHello("Zico"));
        System.out.println(soapService.getServerTime());
    }
}