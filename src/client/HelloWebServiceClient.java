package client;

import service.HelloWebService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class HelloWebServiceClient {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:2019/hello");
        QName qName = new QName("http://service/", "HelloWebServiceImplService"); // parameters were taken from the WSDL description
        Service service = Service.create(url, qName);
        HelloWebService helloWebService = service.getPort(HelloWebService.class);

        // Remote method calling
        System.out.println(helloWebService.getHelloString("Alex"));
    }
}
