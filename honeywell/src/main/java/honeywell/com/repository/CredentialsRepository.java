package honeywell.com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import honeywell.com.domain.Credentials;

@Repository
public interface CredentialsRepository extends CrudRepository<Credentials, String> {

	Credentials findByUserNameAndPassword(String userName, String userPassword);

	Credentials findByUserIdAndToken(String userId, String token);

}
