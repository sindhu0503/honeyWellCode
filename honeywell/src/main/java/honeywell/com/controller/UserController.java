package honeywell.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import honeywell.com.domain.Credentials;
import honeywell.com.dto.UserDTO;
import honeywell.com.service.UserService;


@RestController
@RequestMapping("/")
public class UserController {
	
	 @Autowired 
	 UserService userService;
	 
	 @RequestMapping(value = "login", method = RequestMethod.POST, produces =  MediaType.APPLICATION_JSON_VALUE)
	    public @ResponseBody Credentials loginUser(@RequestBody UserDTO user) throws Exception {
		 Credentials users = null;
	        users = userService.loginUser(user.getUserName(), user.getUserPassword());
	        
	        return users;
	    }
	 
}
