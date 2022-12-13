package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaManyToManyApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaManyToManyApplication.class, args);
		System.out.println("JpaManyToManyApplication project...!!!");
	}

}
//cousreStudent having list of course and again course having list of students this is bit conflicting 
//for jackson data binding to map to that object