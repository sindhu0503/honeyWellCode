package honeywell.com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import honeywell.com.domain.Credentials;
import honeywell.com.domain.Employee;
import honeywell.com.dto.EmployeeDTO;
import honeywell.com.repository.CredentialsRepository;
import honeywell.com.repository.EmployeeRepository;
import honeywell.com.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	CredentialsRepository credentialsRepository;

	public Employee createEmployee(EmployeeDTO employeeDTO, String token, String userId) throws Exception {
		Credentials user = credentialsRepository.findByUserIdAndToken(userId, token);
		Employee emp = null;
		if (user != null) {
			if (employeeDTO != null) {
				emp = new Employee();
				emp.setName(employeeDTO.getName());
				emp.setAge(employeeDTO.getAge());
				emp.setGender(employeeDTO.getGender());
				employeeRepository.save(emp);
			}
		} else {
			throw new Exception("user.does.not.exist");
		}
		return emp;
	}

	public List<Employee> fetchEmployee(String gender, Integer minage, Integer maxage, String token, String userId) throws Exception {
		Credentials user = credentialsRepository.findByUserIdAndToken(userId, token);
		List<Employee> emplyeeList = null;
		if (user != null) {
			emplyeeList = employeeRepository.findByGenderWithAge(gender,minage,maxage);
		}
		else {
			throw new Exception("user.does.not.exist");
		}
		return emplyeeList;
	}

}
