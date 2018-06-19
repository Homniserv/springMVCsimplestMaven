package com.quynguyenblog.springtest.controllerhome;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.quynguyenblog.springtest.controllerinuits.InuitsController;

@Controller
public class HomeController {

	@RequestMapping(value = "/uli", method = RequestMethod.GET)
	public String home() {
		Logger logger = LogManager.getLogger(HomeController.class);
		logger.error("in home  /uli");
		return "home";
	}

	@RequestMapping(value = "/uli1", method = RequestMethod.GET)
	public String home5() {
		Logger logger = LogManager.getLogger(HomeController.class);
		logger.error("in home  /uli1");
		return "home";
	}

	@RequestMapping(value = "/springMVCsimplestMaven/uli1", method = RequestMethod.GET)
	public String home4() {
		Logger logger = LogManager.getLogger(HomeController.class);
		logger.error("in home4 /springMVCsimplestMaven/uli1");
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
