package com.somvelisetty.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}

	@GetMapping("/hello1")
	public String hello1() {
		return "hello1";
	}

	@PostMapping("/post")
	public String post(
			@RequestBody String body
	) {
		return body;
	}

}
