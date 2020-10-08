package in.nit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRestController {
	
	@GetMapping("/info/{sid}")
	public String showInfoTest(
			@PathVariable Integer sid,
			@RequestParam String sname
			) 
	{
		return "Info is=>"+sid+"-"+sname;
	}
	
	

	//Request# .../info/10/ABCD
	@GetMapping("/info/{sid}/{sname}")
	public String showInfo(
			@PathVariable Integer sid,
			@PathVariable String sname
			) 
	{
		return "Info is=>"+sid+"-"+sname;
	}
	
	
	// ../show?sid=10&sname=A
	@GetMapping("/show")
	public String showData(
			@RequestParam(value="sid",
			required = false,
			defaultValue = "10") Integer sid,
			@RequestParam String sname) 
	{
		
		return "Data is=>"+sid+"-"+sname;
	}
}
