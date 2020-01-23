package comm.example.spring.hibernate.demo.entity;

import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        try {
        	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        
        	UserService service=context.getBean("service",UserService.class);
        	UserDetail user=service.createUser(new UserDetail(UUID.randomUUID().toString(), "prasannalucky", "prasanna@gmail.com"));
        	System.out.println(user);
        }catch(Exception e) {
        	e.printStackTrace();
        }
        
    }
}
