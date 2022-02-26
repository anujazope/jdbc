/*Exercise 3 : Write a JAVA program to update the records in BANK table using Statement.executeUpdate().*/
package SQL;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Exercise3 {


	static final String DB_URL = "jdbc:mysql://localhost/SQLAnuja";
	static final String USER = "root";
	static final String PASS = "1234";
	 
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		 
		 Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		 Statement stmt = conn.createStatement();
		 
		 // Open a connection
	      try{	
	    	  String sql ="UPDATE Bank SET AccountName = 'Tushar Zope' where AccountNo = '9876501'";
	    	  stmt.executeUpdate(sql);
	    	  System.out.println("Rows updated = "+ sql);	   
	    	  conn.close();
	        }
	      catch (Exception exc)
	    {
	      exc.printStackTrace();
	    }
	 
	}}
	
