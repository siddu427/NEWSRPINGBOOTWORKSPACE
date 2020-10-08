package in.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot2StarterWebDummyApplication {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(SpringBoot2StarterWebDummyApplication.class, args);
		System.out.println(ac.getClass().getName());
	}

}
