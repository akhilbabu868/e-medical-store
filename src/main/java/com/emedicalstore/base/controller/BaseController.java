package com.emedicalstore.base.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

	
	@RequestMapping("/")
	public String Welcome() {

		return "welcome !";

	}
}
