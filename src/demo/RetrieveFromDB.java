package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveFromDB {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Driver 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Connection to mysql database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon", "root", "root");
		
		//CreateStatement
		Statement stmt = con.createStatement();
		
		//Execute query
		ResultSet rs = stmt.executeQuery("Select * from products;");
		
		//Print in output
		System.out.println("List of Mobile Brands available in Database");
		System.out.println("-------------------------------------------");
		
		//Print list of brand values
		while(rs.next()) {
			System.out.println(rs.getString("brand"));
		}
		
	}

}
