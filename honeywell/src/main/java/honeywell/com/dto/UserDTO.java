package honeywell.com.dto;


import java.util.Date;

import lombok.Data;

@Data
public class UserDTO {
	private Integer userId;

	private String userName;
	
	private String userPassword;

	private String token;

	private Date validity_date;
	

}
