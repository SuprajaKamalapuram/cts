package comm.hibernate.person;

import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session session=factory.openSession();
    	String arr[]=UUID.randomUUID().toString().split("-");
    	Person person=new Person(arr[1], "supraja");
    	session.beginTransaction().begin();
    	session.save(person);
    	session.beginTransaction().commit();
    	System.out.println(person);
    	

    }
}
