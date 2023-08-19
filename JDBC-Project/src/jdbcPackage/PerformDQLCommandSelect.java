
/*
   1) Create a connection
   2) Create statement/Query
   3) Execute Statement/Query using 'executeQuery()' method
   4) Store the returned result in result set
   5) Close connection
*/

package jdbcPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PerformDQLCommandSelect {

	public static void main(String[] args) throws SQLException {

		// 1) Create a connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/geeksofgeek", "root", "root");
		// If the MySQL server is installed on remote machine,
		// Then, we'll have to pass the IP and Name of that machine.

		// 2) Create Statement/Query
		Statement stmt = con.createStatement();

		String s = "SELECT ROLL_NO, NAME, ADDRESS, AGE FROM STUDENT";

		// 3) Execute Statement/Query using 'executeQuery()' method
		// 4) Store the data in ResultSet object reference
		ResultSet rs = stmt.executeQuery(s);

		// If we wish to print data in console
		while (rs.next()) {

			int roll = rs.getInt("ROLL_NO");
			String name = rs.getString("NAME");
			String addrs = rs.getString("ADDRESS");
			int age = rs.getInt("AGE");

			System.out.println(roll + "  " + name + "  " + addrs + "  " + age);

		}

		// 4) Close connection
		con.close();

		System.out.println("Query Executed...");

	}

}
