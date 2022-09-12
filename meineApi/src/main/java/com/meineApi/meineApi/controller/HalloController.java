package com.meineApi.meineApi.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HalloController {

	@GetMapping(path = "/demo")
	public String sayHello() {
		return "Hallo Welt";
	}
	
	@PostMapping(path="/postdemo", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String answerToPost(@RequestBody String s) {
		return s + " ist angekommen";
	}
}
