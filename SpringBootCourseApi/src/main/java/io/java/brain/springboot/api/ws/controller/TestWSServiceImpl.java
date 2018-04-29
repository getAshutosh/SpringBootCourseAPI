package io.java.brain.springboot.api.ws.controller;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService(endpointInterface = "io.java.brain.springboot.api.ws.controller.TestWSServices")
public class TestWSServiceImpl implements TestWSServices {

	@Override
	public String sayHello(String name){
		return "Hello "+name;
	}
	
}
