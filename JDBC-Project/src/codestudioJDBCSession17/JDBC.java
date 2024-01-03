package codestudioJDBCSession17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) throws SQLException {
		
		// Create a connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb_codestudio", "root", "root");
		
		// Create statement/Query
		Statement stmt = con.createStatement();
		
//		String s= "INSERT INTO EMPLOYEE(name,email) VALUES('Ishita', 'ishita@gmail.com')";		
//		stmt.execute(s);
		
		String u = "UPDATE employee set name='Ishita Shirsath' where id = 105";
		stmt.execute(u);
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM employee");
		
		while(rs.next()) {
			int id = rs.getInt("id"); // Here "id" is ColumnName
			String name = rs.getString("name"); // Here "name" is ColumnName
			
			// We can also fetch email, for that we've to create variable for it.
			
			System.out.println(id + "   " + name);
		}

	}

}
