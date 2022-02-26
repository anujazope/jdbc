/*Exercise 1 : Write a JAVA program to update the Bank table with column ("AccountNo","AccountBal") using resultset object.*/



package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Exercise1 {
		
		static final String DB_URL = "jdbc:mysql://localhost/SQLAnuja";
		static final String USER = "root";
		static final String PASS = "1234";
		 
	 public static void main(String[] args) throws SQLException {
		
		 
		 Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		 Statement stmt = conn.createStatement();
		 // Open a connection
	      try{	
	    	  //create bank table
	        String sql ="CREATE TABLE Bank " +
	                  "(BranchName VARCHAR(255), " + 
	                   " BranchID VARCHAR(255))";

	          stmt.executeUpdate(sql);
	        
	         // Insert record in bank table 
	          String sql1 = "insert into Bank values('BANK OF BARODA,KeshavNagar','2109876')";
	    	  stmt.executeUpdate(sql1);
		         System.out.println("Insert Record into database...");   	  
	          
	    
	          
		         //Update table coloum
		         
					
		           ResultSet rs = stmt.executeQuery("ALTER TABLE Bank CHANGE BranchName AccountNO char(50),\r\n"
				   		+ "change BranchID AccountBal Char(50);");
				    	    System.out.println("Query OK, " + rs + " rows affected");
		         while(rs.next()){
		        	 
		         }
				   String  selectSql=  "SELECT * FROM Bank";
				   stmt = conn.createStatement();	//
				   stmt.executeQuery(selectSql);
	         
	      conn.close();
	        }
   catch (Exception exc)
	    {
	      exc.printStackTrace();
	    }
	 }}
	