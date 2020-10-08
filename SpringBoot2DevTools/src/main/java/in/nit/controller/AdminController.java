package in.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

	@RequestMapping("/admin")
	public String show(Model model) {
		model.addAttribute("name", "SAM-TEST");
		return "AdminPage";
	}
}
