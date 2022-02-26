/*Exercise 7 : Write a Java program  to insert a record with values taken from user into 
  the table countries against each columns using prepared statement.
 We can use a string array to store our own values.

SQL questions*/

package SQL;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Exercise7 {
	static final String DB_URL = "jdbc:mysql://localhost/SQLAnuja";
	static final String USER = "root";
	
	static final String PASS = "1234";
	 public static String country_id;
	 public static String country_name;
	 public static String region_id;
	 public static String region_name;
	 
 public static void main(String[] args) throws SQLException {
	
	    Scanner in = new Scanner(System.in);
	    
	   System.out.println("Enter country_id = ");
	   String country_id = in.nextLine();
	   setCountry_id(country_id);
	   
	   System.out.println("Enter country_name = " );
	   String country_name = in.nextLine();
	   setCountry_name(country_name);
	   
	   System.out.println("Enter region_id = ");
	   String region_id = in.nextLine();
	   setRegion_id(region_id);
	   
	   System.out.println("Enter region_name = ");
	   String region_name = in.nextLine();
	   setRegion_name(region_name);
	
	   // Open a connection
      try{	
    	  Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
    		 Statement stmt = conn.createStatement();
		String INSERT_RECORD = "insert into COUNTRIES(country_id ,country_name , region_id,region_name) values(?,?,?,?)";
   	    
   	    PreparedStatement pstmt = conn.prepareStatement(INSERT_RECORD);
   	    pstmt.setString(1,getCountry_id());
   	    pstmt.setString(2,getCountry_name());
   	    pstmt.setString(3,getRegion_id());
   	    pstmt.setString(4,getRegion_name());
   	    pstmt.execute();
     	 conn.close();
		System.out.println("Record inserted Succeddfully ");
	}catch(Exception e){System.out.println(e);
	System.out.println("Record Not Added Succeddfully ");}
	
}
      
      public static String getCountry_id() {
  		return country_id;
  	}

  	public static void setCountry_id(String country_id) {
  		Exercise7.country_id = country_id;
  	}

  	public static String getCountry_name() {
  		return country_name;
  	}

  	public static void setCountry_name(String country_name) {
  		Exercise7.country_name = country_name;
  	}

  	public static String getRegion_id() {
  		return region_id;
  	}

  	public static void setRegion_id(String region_id) {
  		Exercise7.region_id = region_id;
  	}

  	public static String getRegion_name() {
  		return region_name;
  	}

  	public static void setRegion_name(String region_name) {
  		Exercise7.region_name = region_name;
  	}

 }
 