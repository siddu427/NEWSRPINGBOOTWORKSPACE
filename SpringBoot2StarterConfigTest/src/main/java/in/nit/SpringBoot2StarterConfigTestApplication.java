package in.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import in.nit.model.ProductInfo;

@SpringBootApplication // =Configuration
public class SpringBoot2StarterConfigTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2StarterConfigTestApplication.class, args);
	}
	
	@Bean
	public ProductInfo info() {
		ProductInfo p= new ProductInfo();
		p.setPid(202);
		return p;
	}

}
