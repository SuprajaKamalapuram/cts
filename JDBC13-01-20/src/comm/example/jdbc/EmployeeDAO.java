package comm.example.jdbc;

import java.util.List;
import java.sql.SQLException; 

public interface EmployeeDAO {

	 public List<Employee> getAllEmployees() throws SQLException;
}
