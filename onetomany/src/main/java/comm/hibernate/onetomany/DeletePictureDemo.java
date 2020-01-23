package comm.hibernate.onetomany;
import comm.hibernate.onetomany.Picture;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import comm.hibernate.onetomany.Album;
import comm.hibernate.onetomany.MyImage;
public class DeletePictureDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Album.class)
								.addAnnotatedClass(MyImage.class)
								.addAnnotatedClass(Picture.class)
								.buildSessionFactory();
	Session session = factory.getCurrentSession();
		try {			
		session.beginTransaction();
			int theId = 10;
			Picture tempPicture = session.get(Picture.class, theId);
		System.out.println("Deleting course: " + tempPicture);
			session.delete(tempPicture);
			session.getTransaction().commit();
			System.out.println("Done!");
		}
		finally {
			session.close();
			factory.close();
		}
	}
}
