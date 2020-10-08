package in.nit.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//ctrl+shift+O (imports)

@Component
@Order(-3)
public class JdbcTestRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
			System.out.println("from JDBC Test Runner-5");
	}
	

	
}


