package comm.mycompany.hibernatehierarchy;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("current_employee")
public class CurrentEmployee extends Employee {
	
	private String languages;
	private int region;
	
	public CurrentEmployee() {
		
	}

	public CurrentEmployee(String name,
	String address,
	LocalDate joiningDate,
	double salary,String language,int region) {
		
		super(name,address,joiningDate,salary);
		languages = language;
		this.region = region;
		
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}

	public int getRegion() {
		return region;
	}

	public void setRegion(int region) {
		this.region = region;
	}
	
}
