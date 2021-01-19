package com.higuchi.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalendarController {
	
	@RequestMapping(value="/" , method=RequestMethod.GET)
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping(value="/" , method=RequestMethod.POST)
	public ModelAndView send(
			@RequestParam(value="year")int year,
			@RequestParam(value="month")String monthSelect,	//選択リストはString
			ModelAndView mav) {
		
		//選択リストのStringをintに変換
		int month = Integer.parseInt(monthSelect);
		
		mav.setViewName("index");
		return mav;
	}
	
}
