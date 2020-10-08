package in.nit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nit.service.AlertService;

@Component
public class ProfileCombinationTestRunner implements CommandLineRunner {
	@Autowired
	private AlertService service;	
	
	@Override
	public void run(String... args) throws Exception {
		service.showAlert();
	}

}
