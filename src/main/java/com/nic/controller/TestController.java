package com.nic.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nic.Model.DivIterate;
import com.nic.Model.Index;

@Controller
@RequestMapping("/")
public class TestController {
	
	@GetMapping("/")
	public String index(Model m) {
//		System.out.println("DATA : "+m);
		return "index";
	}
	
	@RequestMapping(value="/disp-data", method = RequestMethod.POST)
	public String dispData(Index m) {
//		System.out.println("DATA : "+m);
		System.out.println("t1 : "+m.getT1());
		return "done";
	}
	
	@GetMapping("/iterate")
	public ModelAndView iterate() {
		ModelAndView modelAndView = new ModelAndView();
		List<DivIterate> li=new ArrayList<>();
		li.add(new DivIterate("Ram","123"));
		li.add(new DivIterate("Baig","123"));
		li.add(new DivIterate("Gayatri","123"));
		li.add(new DivIterate("Sagar","123"));
		li.add(new DivIterate("Girija","123"));
		
		modelAndView.setViewName("DivIterate");
		modelAndView.addObject("user", li);
		return modelAndView;
	}
	
}
