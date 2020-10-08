package in.nit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nit.model.ProductInfo;

@Component
public class ConfigTestRunner 
	implements CommandLineRunner
{
	@Autowired
	private ProductInfo info;
	
	@Override
	public void run(String... args) throws Exception {
			System.out.println("from runner"+info);
	}
}



