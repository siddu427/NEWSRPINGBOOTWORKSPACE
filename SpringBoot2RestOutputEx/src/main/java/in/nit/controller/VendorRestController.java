package in.nit.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.nit.model.Vendor;

@RestController
public class VendorRestController {
	

	@PostMapping("/data")
	public String showData(
			//@RequestBody className objectName
			@RequestBody Vendor vendor) 
	{
		return "Hello=>"+vendor.toString();
	}
}
