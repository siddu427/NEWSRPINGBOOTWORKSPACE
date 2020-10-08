package in.nit.runner;

import java.util.Properties;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix = "my.app")
@Data
public class ProjectDataRunner implements CommandLineRunner{

	//private Map<String,Double> versions;
	private Properties versions;
	
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}

	

	
	
	

	
	
	
}



