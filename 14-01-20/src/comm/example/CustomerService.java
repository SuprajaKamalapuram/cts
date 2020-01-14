package comm.example;

import java.sql.SQLException;

import comm.example.Customer;

public interface CustomerService {
	public Customer createCustomer(String firstName,String lastName,String email) throws SQLException;
}
