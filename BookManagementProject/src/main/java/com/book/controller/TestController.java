package com.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/book")
public class TestController {
	
	@GetMapping("/get")
	public String getData()
	{
		return "Hello Priya....";
	}

}
