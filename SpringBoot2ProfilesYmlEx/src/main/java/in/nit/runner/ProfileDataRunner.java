package in.nit.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProfileDataRunner 
	implements CommandLineRunner
{
	@Value("${my.db}")
	private String dbCode;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(dbCode);
	}

}
