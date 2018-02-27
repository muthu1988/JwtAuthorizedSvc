package com.auth.jwt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="ping")
public class SampleController {
	
	@PostMapping
	private String somepost() {
		return "muthu";
	}
	
	@GetMapping
	private String someget() {
		return "muthu";
	}

}
