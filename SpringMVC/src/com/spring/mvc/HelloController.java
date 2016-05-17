package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
	public class HelloController{
		@RequestMapping("/hello")
		public ModelAndView helloWorld(){
			String message = "Hello Spring";
			return new ModelAndView("hello","message",message);
		}

		@RequestMapping("/hello1")
		public ModelAndView helloWorld1(){
			String message = "Hello Spring 2";
			return new ModelAndView("hello1","message",message);
		}
	}