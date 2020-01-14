package comm.example;

import java.sql.SQLException;

public interface CustomerDAO {
	public Customer createCustomer(String firstName,String lastName,String email) throws SQLException;

}
