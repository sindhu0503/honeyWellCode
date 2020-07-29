package honeywell.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import honeywell.com.domain.Employee;
import honeywell.com.dto.EmployeeDTO;
import honeywell.com.service.EmployeeService;



@RestController
@RequestMapping("/")
public class EmployeeController {
	
@Autowired
EmployeeService employeeService;
	 
@RequestMapping(value = "employee", method = RequestMethod.POST, produces =  MediaType.APPLICATION_JSON_VALUE)
	    public @ResponseBody Employee createEmployee(@RequestBody EmployeeDTO employeeDTO , @RequestHeader ("token") String token,@RequestHeader ("userId") String userId  ) throws Exception {
		 return  employeeService.createEmployee(employeeDTO, token, userId);
	    }
	 
@RequestMapping(value = "employees", method = RequestMethod.GET, produces =  MediaType.APPLICATION_JSON_VALUE)
	    public @ResponseBody List<Employee> fetchEmployee(@RequestParam("gender") String gender, @RequestParam("minage") String minage,  @RequestParam( "maxage") String maxage, @RequestHeader ("token") String token,@RequestHeader ("userId") String userId ) throws Exception {
		 return employeeService.fetchEmployee(gender, Integer.parseInt(minage), Integer.parseInt(maxage), token, userId);
	        
	    }

}
