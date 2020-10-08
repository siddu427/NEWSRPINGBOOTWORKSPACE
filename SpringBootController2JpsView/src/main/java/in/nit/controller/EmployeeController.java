package in.nit.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/emp")
public class EmployeeController {
	
	@RequestMapping(value = "/reg",method = POST)
	public String show(){
		return "EmployeeReg";
	}
	
}