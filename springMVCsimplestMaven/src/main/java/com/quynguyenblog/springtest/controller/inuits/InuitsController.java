package com.quynguyenblog.springtest.controller.inuits;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//   import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**https://stackoverflow.com/questions/5854415/spring-mvc-404-error*/
@Controller
public class InuitsController {

	@RequestMapping(value = "/inuits1", method = RequestMethod.GET)
	public String home() {
		Logger logger = LogManager.getLogger(InuitsController.class);
		logger.error("in home  /inuits1");
		return "inuito1";
	}
	
	
	
	
	@RequestMapping(value = "/inuits2", method = RequestMethod.GET)
	public String home2() {
		Logger logger = LogManager.getLogger(InuitsController.class);
		logger.error("in home  /inuits2");
		return "/WEB-INF/inuits/inuito2.jsp";
	}
	
	 
}
