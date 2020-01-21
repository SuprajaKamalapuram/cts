package comm.hibernate.HibernateAnnotation;

import java.io.IOException;
import java.time.LocalDate;

public class App {

	private static PersonService service;
	static {
		service=new PersonServiceImpl();
	}
	public static void main(String[] args) throws IOException

	{
		
		
		
		
		
		/*  Person p=service.createPerson(new Person("U105","navii",LocalDate.now()));
		  System.out.println(p);*/
		 
		 Person p1=service.updatePerson(2);
		 System.out.println(p1);
		
		/*
		 * Person p=service.getPersonByid(100); System.out.println(p);
		 */
		//service.deletePerson(1);
	}
}
