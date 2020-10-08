package in.nit.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//ctrl+shift+O
@Component
public class MyMessageRunner implements CommandLineRunner{

	//@Value("NIT")
	@Value("${my.app.model}")
	private String appName;
	//@Value("3.2")
	@Value("${my.app.version}")
	//@Value("#{5.0+6.3}")
	private double appVersion;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}

	//atl+shift+S , S >OK
	@Override
	public String toString() {
		return "MyMessageRunner [appName=" + appName + ", appVersion=" + appVersion + "]";
	}

	//set/get not need for @Value.
	
}
