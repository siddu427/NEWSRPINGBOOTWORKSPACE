package in.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {

	@GetMapping("/show")
	public String showData(
			@RequestParam(value = "eid")int id,
			Model model
			) 
	{
		System.out.println("Data is=>"+id);
		model.addAttribute("aid", id);
		return "Data";
	}
}
