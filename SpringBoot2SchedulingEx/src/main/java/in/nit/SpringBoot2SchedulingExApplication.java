package in.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBoot2SchedulingExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2SchedulingExApplication.class, args);
	}

}
