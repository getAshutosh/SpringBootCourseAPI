package io.java.brain.springboot;

import io.java.brain.springboot.api.ws.controller.TestWSServiceImpl;

import javax.xml.ws.Endpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApi {

	public static void main(String[] args) {
		SpringApplication.run(CourseApi.class, args);
		//This is for SOAP based services test
		Endpoint.publish("http://localhost:8888/testWS", new TestWSServiceImpl());
		System.out.println("web services is published");
	}

}
