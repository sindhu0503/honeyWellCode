package honeywell.com.serviceImpl;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import honeywell.com.domain.Credentials;
import honeywell.com.repository.CredentialsRepository;
import honeywell.com.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	CredentialsRepository credentialsRepository;

	public Credentials loginUser(String userName, String userPassword) throws Exception {
		Credentials user = credentialsRepository.findByUserNameAndPassword(userName, userPassword);
		if(user != null) {
			user.setValidity(new Date());
			user.setToken(String.valueOf(UUID.randomUUID()));
			credentialsRepository.save(user);
		}else {
			 throw new Exception("user.does.not.exist");
		}
		return user;
	}

}
