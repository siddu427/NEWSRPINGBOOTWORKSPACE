package in.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.nit.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	@Query("select count(stdName) from Student where stdName=:stdName")
	Integer countofStdName(String stdName);
}
