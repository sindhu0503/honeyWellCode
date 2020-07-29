package honeywell.com.service;

import java.util.List;

import org.springframework.stereotype.Component;

import honeywell.com.domain.Employee;
import honeywell.com.dto.EmployeeDTO;

@Component
public interface EmployeeService {

	Employee createEmployee(EmployeeDTO employeeDTO,String token, String userId) throws Exception;

	List<Employee> fetchEmployee(String gender, Integer minage, Integer maxage, String userId, String token) throws Exception;


}
