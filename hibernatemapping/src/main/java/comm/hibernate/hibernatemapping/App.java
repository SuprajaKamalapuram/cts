package comm.hibernate.hibernatemapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
    	
try {
			
			SessionFactory factory=new Configuration()
					.configure().addAnnotatedClass(ToDo.class)
					.addAnnotatedClass(Task.class).buildSessionFactory();
			Session session=factory.openSession();
			ToDo todo=new ToDo(101,"Suppu","Kshatri");
			todo.setTask(new Task("perform"));
			session.getTransaction().begin();
			session.save(todo);
			session.getTransaction().commit();
			
		} 
       catch (Exception e) {
			e.printStackTrace();
		}

	}
    }

