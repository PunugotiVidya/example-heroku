package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sampleController {
	@RequestMapping("/homepage")
	public String homepage() {
		return "homepage";
	}
	@RequestMapping("message")
	public String message() {
		return "successfull";
	}

}
