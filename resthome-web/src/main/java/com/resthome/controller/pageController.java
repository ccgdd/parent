package com.resthome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class pageController {

 
	@RequestMapping("/page_{list}_{page}.action")
	public String	showIndex(@PathVariable String list ,@PathVariable String page){
		return "pages/"+list+"/"+page;
	}	
	
	
	
}
