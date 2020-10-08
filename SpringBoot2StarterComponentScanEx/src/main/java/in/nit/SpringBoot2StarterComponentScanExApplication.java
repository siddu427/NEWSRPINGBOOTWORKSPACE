package in.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot2StarterComponentScanExApplication {

	public static void main(String[] args) {
		SpringApplication app=
				new SpringApplication(SpringBoot2StarterComponentScanExApplication.class);
		//app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
}
