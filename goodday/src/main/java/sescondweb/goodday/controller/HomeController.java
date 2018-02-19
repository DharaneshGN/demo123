package sescondweb.goodday.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("goodday")
public class HomeController {

	@RequestMapping(method=RequestMethod.GET)
	public String test(HttpServletResponse response) throws IOException{
		System.out.println("hai123");
		return "home";
	}
	@RequestMapping(value="hello", method = RequestMethod.POST)
	public ModelAndView test1(HttpServletResponse response) throws IOException{
		System.out.println("hai");
		return new ModelAndView("hello");
	}
	
}
