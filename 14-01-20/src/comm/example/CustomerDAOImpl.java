package comm.example;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import comm.example.MyConnectionFactory;

public class CustomerDAOImpl implements CustomerDAO {

	private MyConnectionFactory factory=null;
	private Connection connection=null;
	PreparedStatement pStatement=null;
	private Customer customer=null;
	{
		factory=MyConnectionFactory.getFactoryObject();
		try {
			connection=factory.getMyConnection();
		} catch (IOException | SQLException e) {

			e.printStackTrace();
		}
	}
	@Override
	public Customer createCustomer(String firstName, String lastName, String email) throws SQLException {
		customer=new Customer(firstName, lastName, email);
		pStatement=connection.prepareStatement("insert into "
				+ "customer(first_name,last_name,email) "
				+ "values(?,?,?)");
		pStatement.setString(1, customer.getFirstName());
		pStatement.setString(2, customer.getLastName());
		pStatement.setString(3, customer.getEmail());
		pStatement.executeUpdate();
		return customer;
	}

}
