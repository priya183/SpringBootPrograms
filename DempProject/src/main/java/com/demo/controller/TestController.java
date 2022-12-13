package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	Logger logger=LoggerFactory.getLogger(TestController.class);
	
	@GetMapping("/get")
	public String show()
	{
  
		logger.trace("HEYYYY PRIYAAAAAAAAAAAAAAAAAAAAAAAAAA");
		return "HIIII";
	}
	
	

}
