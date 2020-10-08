package in.nit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot2StarterConmponentTestApplication 
	implements CommandLineRunner
{

	@Value("${my.app.code}") 
	private String code;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2StarterConmponentTestApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("from starter-runner:"+code);
	}

}
