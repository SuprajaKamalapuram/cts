package comm.hibernate.onetomany;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import comm.hibernate.onetomany.Album;
import comm.hibernate.onetomany.MyImage;
public class DeleteMyImageDemo {

	public static void main(String[] args) {

		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Album.class)
								.addAnnotatedClass(MyImage.class)
								.buildSessionFactory();
		
		
		Session session = factory.getCurrentSession();
		
		try {			
			

			session.beginTransaction();

		
			//int theId = 3;
			MyImage tempMyImage = new MyImage("https:??url1");
					//session.get(MyImage.class, theId);
			
			
			System.out.println("tempMyImage: " + tempMyImage);
						
		
			System.out.println("the associated image: " + 
								tempMyImage.getAlbum());
			
	
			System.out.println("Deleting tempMyImage: " 
											+ tempMyImage);

			
			
			tempMyImage.getAlbum().setImage(null);
			
			session.delete(tempMyImage);
			
			
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
			
			//session.close();
			
			factory.close();
		}
	}

}
