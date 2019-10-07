package com.shereen.creation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/shereen")
public class UserController {

	
	 @RequestMapping(value="/" , method = RequestMethod.GET )
	public String  indexPage()
	{
		 return "index";
	}
	
}
