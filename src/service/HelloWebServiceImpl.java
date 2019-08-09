package service;

import javax.jws.WebService;

@WebService(endpointInterface = "service.HelloWebService")
public class HelloWebServiceImpl implements HelloWebService{
    @Override
    public String getHelloString(String name) {
        return "Hello, " + name + "!";
    }
}
