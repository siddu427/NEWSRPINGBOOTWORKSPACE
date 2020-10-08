package in.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nit.model.Employee;

public interface EmployeeRepository 
	extends JpaRepository<Employee, Integer> {

}
