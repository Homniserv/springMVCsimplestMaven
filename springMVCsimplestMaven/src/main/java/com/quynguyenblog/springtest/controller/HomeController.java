package com.quynguyenblog.springtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/uli", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@RequestMapping(value = "/uli2", method = RequestMethod.GET)
	public String home2() {
		return "home2";
	}
	
	@RequestMapping(value = "/springMVCsimplestMaven/", method = RequestMethod.GET)
	public String home3() {
		return "home3";
	}
}
