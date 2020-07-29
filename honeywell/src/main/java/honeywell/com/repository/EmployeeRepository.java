package honeywell.com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import honeywell.com.domain.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

	@Query("select e from Employee e where e.gender =:gender and e.age BETWEEN :minage AND :maxage")
	List<Employee> findByGenderWithAge(@Param("gender") String gender, @Param("minage") Integer minage, @Param("maxage") Integer maxage);

}
