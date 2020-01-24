package comm.mycompany.hibernatehierarchy;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("per_employee")

public class PerEmployee extends Employee {
	
	private String hobby;
	
	public PerEmployee() {
		
	}
	public PerEmployee(String name,
			String address,
			LocalDate joiningDate,
			double salary,String hobbies) {
		
		super(name,address,joiningDate,salary);
		hobby=hobbies;
		
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

}
