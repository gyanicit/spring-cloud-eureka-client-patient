package com.netflixeEureka.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {
	
	@RequestMapping("/patient/get")
	public String getPatient() {
		return "showing patient detail";
	}

}
