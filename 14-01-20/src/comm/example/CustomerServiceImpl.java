package comm.example;

import java.sql.SQLException;

import comm.example.Customer;
import comm.example.CustomerDAO;
import comm.example.CustomerDAOImpl;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDAO dao;
	{
		dao=new CustomerDAOImpl();
	}

	@Override
	public Customer createCustomer(String firstName, String lastName, String email) throws SQLException {
		
		return dao.createCustomer(firstName, lastName, email);
	}

}
