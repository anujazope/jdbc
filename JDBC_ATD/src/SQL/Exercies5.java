/*Exercise 5: Write a Java program to create  a table  countries including columns country_id,country_name and region_id .*/

package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Exercies5 {

	static final String DB_URL = "jdbc:mysql://localhost/SQLEXERCISE";
	static final String USER = "root";
	static final String PASS = "Atkar@2021";
	 
 public static void main(String[] args) throws SQLException {
	
	 
	 Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	 Statement stmt = conn.createStatement();
	 
	 // Open a connection
      try{	
    	  String sql ="CREATE TABLE COUNTRIES(country_id char(50),country_name char(50), region_id char(50)) ";
    	  stmt.execute(sql);
    	  System.out.println("Table Created");	   
    	  conn.close();
      }
      catch (Exception exc)
      {
    	  exc.printStackTrace();
      }
 	}	
 }

