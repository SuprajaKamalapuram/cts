package comm.hibernate.bidirection;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateDemo {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Album.class)
				.addAnnotatedClass(MyImage.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			Album tempAlbum = new Album("Suppu",LocalDate.now());

			MyImage tempMyImage = new MyImage("https://www.pexels.com/search/flower");

			tempAlbum.setImage(tempMyImage);

			session.getTransaction().begin();

			System.out.println("Saving image: " + tempAlbum);
			session.save(tempAlbum);

			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {
			factory.close();
		}
	}

}

