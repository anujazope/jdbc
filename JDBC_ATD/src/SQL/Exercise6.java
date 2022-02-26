/*Exercise 6 : Write a Java program to  alter table countries including 
 columns country_id,country_name and region_id  to add a column region_id .*/

package SQL;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Exercise6 {
	static final String DB_URL = "jdbc:mysql://localhost/SQLAnuja";
	static final String USER = "root";
	static final String PASS = "1234";
	 
 public static void main(String[] args) throws SQLException {
	
	 
	 Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	 Statement stmt = conn.createStatement();
	 
	 // Open a connection
      try{	
    	  String sql ="ALTER TABLE COUNTRIES ADD region_name char(55) ";
    	  stmt.executeUpdate(sql);
    	  System.out.println("Rows updated = "+ sql);	   
    	  conn.close();
      }
      catch (Exception exc)
      {
    	  exc.printStackTrace();
      }
 	}	
 }

