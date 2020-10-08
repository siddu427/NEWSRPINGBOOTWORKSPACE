package in.nit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nit.model.Student;
import in.nit.repo.StudentRepository;

@Component
public class StudentRunner implements CommandLineRunner {
	@Autowired
	private StudentRepository repo;	
	
	@Override
	public void run(String... args) throws Exception {
		repo.save(new Student(20, "RAJ", 3500.0));
		repo.save(new Student(11, "SAM", 4500.0));
		repo.save(new Student(12, "KHAN", 5600.0));
		System.out.println("--DONE--");
		
	}

}



