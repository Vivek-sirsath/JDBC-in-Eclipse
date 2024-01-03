
/*
   1) Create a connection
   2) Create statement/Query
   3) Execute Statement/Query using 'execute()' method
   4) Close connection
*/

package jdbcPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PerformDMLCommands {

	public static void main(String[] args) throws SQLException {

		// 1) Create a connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
		// "jdbc:mysql://localhost:3306/DATABASE NAME", "root", "root"
		// 'jdbc' is the database name
		// If the MySQL server is installed on remote machine,
		// Then, we'll have to pass the IP and Name of that machine.

		// 2) Create Statement/Query
		Statement stmt = con.createStatement();

//		String s= "INSERT INTO EMPLOYEE VALUES(103,'Ishita')";
//		String s = "UPDATE EMPLOYEE SET NAME = 'Vandana' WHERE empID = 103";
		String s = "DELETE FROM EMPLOYEE WHERE empID = 103";

		// 3) Execute Statement/Query using 'execute()' method
		stmt.execute(s);

		// 4) Close connection
		con.close();

		System.out.println("Query Executed...");
	}

}
