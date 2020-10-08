package in.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nit.model.Contract;

public interface ContractRepo extends JpaRepository<Contract, Integer>{
	
}
