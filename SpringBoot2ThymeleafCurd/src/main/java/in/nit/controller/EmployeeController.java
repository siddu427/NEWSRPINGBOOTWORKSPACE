package in.nit.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.nit.model.Employee;
import in.nit.service.IEmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private IEmployeeService service;	

	//1. show Register Page with Form Backing Object
	@GetMapping("/register")
	public String showReg(Model model) {
		model.addAttribute("employee", new Employee());
		return "EmployeeRegister";
	}
	
	//2. Read form Data and perform save
	@PostMapping("/save")
	public String save(
			@ModelAttribute Employee employee,
			Model model) 
	{
		Integer id=service.saveEmployee(employee);
		model.addAttribute("message", "Employee '"+id+"' saved!");
		model.addAttribute("employee", new Employee());
		return "EmployeeRegister";
	}
	
	//3. fetch data to UI
	@GetMapping("/all")
	public String showData(Model model) {
		List<Employee> list=service.getAllEmployees();
		model.addAttribute("list", list);
		return "EmployeeData";
	}
	
	//4.delete employee based on Id
	@GetMapping("/delete")
	public String delete(@RequestParam Integer id,Model model)
	{
		service.deleteEmployee(id);
		List<Employee> list=service.getAllEmployees();
		model.addAttribute("list", list);
		model.addAttribute("message","Employee '"+id+"' Deleted");
		return "EmployeeData";
		//response.sendRedirect
		//return "redirect:all";
	}
	
	//5. show Edit page
	@GetMapping("/edit")
	public String showEdit(
			@RequestParam Integer id, 
			Model model)
	{
		Optional<Employee> opt=service.getOneEmployee(id);
		model.addAttribute("employee", opt.get());
		return "EmployeeEdit";
	}
	
	//6. update operation
	@PostMapping("/update")
	public String doUpdate(@ModelAttribute Employee employee, Model model) {
		
		service.updateEmployee(employee);
		List<Employee> list=service.getAllEmployees();
		model.addAttribute("list", list);
		model.addAttribute("message","Employee '"+employee.getEmpId()+"' Updated");
		return "EmployeeData";
	}
	
	
	
	
}
