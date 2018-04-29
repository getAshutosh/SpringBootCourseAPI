package io.java.brain.springboot.api.ws.controller;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style=SOAPBinding.Style.RPC)
public interface TestWSServices {
	@WebMethod
	public String sayHello(String name);
	

}
