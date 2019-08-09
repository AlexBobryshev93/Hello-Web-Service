package endpoint;

import service.HelloWebServiceImpl;

import javax.xml.ws.Endpoint;

//  http://localhost:2019/hello?wsdl shows the service WSDL description
public class HelloWebServicePublisher {
    public static void main(String...args) {
        Endpoint.publish("http://localhost:2019/hello", new HelloWebServiceImpl());
    }
}
