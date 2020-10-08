package in.nit.cotroller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

	@RequestMapping("/data")
	public String showData(Model model) {
		//JDK >=1.9
		List<String> list=List.of("A","B","C");
		Map<String,String> map=Map.of("K1","V1","K2","V2");
		
		model.addAttribute("list", list); //data added to request scope
		model.addAttribute("map", map); //data added to request scope
		
		
		return "EmpData";
	}
}
