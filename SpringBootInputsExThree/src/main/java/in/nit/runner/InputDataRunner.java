package in.nit.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InputDataRunner implements CommandLineRunner {

	@Value("${my.app.id}")
	private int appId;
	
	@Value("${my.app.name}")
	private String appName;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "InputDataRunner [appId=" + appId + ", appName=" + appName + "]";
	}
	
	

}
