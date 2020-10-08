package in.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpController {
	
	@RequestMapping("/show")
	public ModelAndView showData() 
	{
		ModelAndView m=new ModelAndView();
		m.setViewName("Data"); //UI Page name
		m.addObject("title", "NareshIT HYD");
		return m;
	}
	
	@RequestMapping("/shownew")
	public String showDataNew(ModelMap map) {
		map.addAttribute("title", "NareshIT HYD-NEW");
		return "Data";
	}
}



