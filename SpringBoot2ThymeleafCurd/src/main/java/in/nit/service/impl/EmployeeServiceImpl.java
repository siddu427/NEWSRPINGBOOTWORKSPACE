package in.nit.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nit.model.Employee;
import in.nit.repo.EmployeeRepository;
import in.nit.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public Integer saveEmployee(Employee e) {
		return repo.save(e).getEmpId();
	}

	@Override
	public void updateEmployee(Employee e) {
		repo.save(e);
	}

	@Override
	public void deleteEmployee(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public Optional<Employee> getOneEmployee(Integer id) {
		return repo.findById(id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

}
