package kr.com.jc2019.main.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.com.jc2019.main.service.Test01Service;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);

	@Autowired
	Test01Service test01Service;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = { "/main", "/" }, method = RequestMethod.GET)
	public String home(Model model) {
		
		model.addAttribute("test01List", test01Service.selectTest01List());
		System.out.println("aa: "+test01Service.selectTest01List());
		return "/main/home";
	}
	
}
