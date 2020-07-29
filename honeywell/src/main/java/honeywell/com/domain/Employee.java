package honeywell.com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "EMPLOYEE")
@Data
public class Employee {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMP_ID_SEQ")
	@SequenceGenerator(name = "EMP_ID_SEQ", sequenceName = "EMP_ID_SEQ", allocationSize = 1)
	@Column(name = "EMPLOYEE_ID")
	private Integer empId;

	@Column(name = "NAME")
	private String name;
	
	@Column(name = "AGE")
	private Integer age;
	
	@Column(name = "GENDER")
	private String gender;

	
	
}
