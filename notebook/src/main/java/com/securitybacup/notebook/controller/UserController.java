package com.securitybacup.notebook.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
	
	
	
	@GetMapping("/qqq")
	public String GetMessage()
	{
		return "yadav";
	}

	@GetMapping("/user")
	public String user()
	{
	return "welcome sourav";
	}


	@GetMapping("/admin")
	public String admin()
	{
		return "star player";
	}

	}


