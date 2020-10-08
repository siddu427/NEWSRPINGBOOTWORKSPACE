package in.nit.runner;

import org.springframework.boot.CommandLineRunner;

//@Component
//@Order(6)
public class BatchExRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("from Batch Runner-6");
		
	}
}
