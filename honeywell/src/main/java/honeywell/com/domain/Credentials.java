package honeywell.com.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name = "CREDENTIALS")
@Data
public class Credentials {
	
	@Id
	@Column(name = "USER_ID")
	private String userId;

	@Column(name = "USER_NAME")
	private String userName;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "TOKEN")
	private String token;

	@Column(name = "VALIDITY")
	private Date validity;
	
	

}
