package honeywell.com.service;

import org.springframework.stereotype.Component;

import honeywell.com.domain.Credentials;

@Component
public interface UserService {

	Credentials loginUser(String userName, String userPassword) throws Exception;

}
