package com.springmvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
//	
//	@RequestMapping(value = "/hello", method = RequestMethod.GET)
//	public ModelAndView hello() {
//		ModelAndView modelView = new ModelAndView();
//		modelView.addObject("name", "aaaaaaa");
//		modelView.setViewName("index");
//		return modelView;
//	}
	
	@RequestMapping("hello")
	public void hello() {
		System.out.println("hello");
	}
}
