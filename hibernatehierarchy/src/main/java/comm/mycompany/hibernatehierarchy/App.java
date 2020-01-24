package comm.mycompany.hibernatehierarchy;

import java.awt.print.Book;
import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
       Session session=null;
       try {
    	   
    	   session=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Book.class).
    			   addAnnotatedClass(CurrentEmployee.class).addAnnotatedClass(PerEmployee.class).
    			   buildSessionFactory().getCurrentSession();
    	   Employee emp1=new Employee("suppu","kurnool",LocalDate.now(),12000);
    	   Employee emp2=new CurrentEmployee("prassu","kadapa",LocalDate.now(),15000,"English",1);
    	   Employee emp3=new PerEmployee("nava", "dhone", LocalDate.now(), 20000, "reading");
    	   session.getTransaction().begin();
    	   session.save(emp1);
    	   session.save(emp2);
    	   session.save(emp3);
    	   session.getTransaction().commit();
    	   System.out.println("done");
    	   
       
       }
       finally {
    	   //session.close();
       
    }
}
}
