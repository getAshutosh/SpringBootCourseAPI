package io.java.brain.springboot.api.ws.controller;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Endpoint;
import javax.xml.ws.Service;

public class ClientTest {
	
	

	public static void main(String[] args) throws Exception {
		//access wsdl file
		//http://localhost:8888/testWS?wsdl
		Endpoint.publish("http://localhost:8889/testWS", new TestWSServiceImpl());
		System.out.println("web services is published");
		//for reference
		//http://www.mkyong.com/webservices/jax-ws/jax-ws-hello-world-example/	
		URL url = new URL("http://localhost:8889/testWS?wsdl");

        //1st argument service URI, refer to wsdl document above
		//2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://controller.ws.api.springboot.brain.java.io/", "TestWSServiceImplService");

        Service service = Service.create(url, qname);

        TestWSServices hello =  service.getPort(TestWSServices.class);

        System.out.println(hello.sayHello("Ashutosh"));
	}

}
