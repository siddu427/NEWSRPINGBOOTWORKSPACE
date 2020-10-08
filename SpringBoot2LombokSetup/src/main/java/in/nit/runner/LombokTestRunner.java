package in.nit.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nit.model.Employee;

@Component
public class LombokTestRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		Employee emp=new Employee(10, "AA", 3.3, 99.5);
		System.out.println(emp);
		
		Employee e2=new Employee();
		e2.setEmpId(88);
		e2.setEmpName("SAM");
		e2.setEmpSal(6.58);
		e2.setEmpMrks(58.65);
		
		System.out.println(e2);
	}
}



