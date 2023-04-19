package com.rlagus.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping(value = "/page")
	public String testpage() {
		
		return "hellow";
	}
	
}
