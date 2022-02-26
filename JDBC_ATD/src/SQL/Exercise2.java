/*Exercise 2 : Write a JAVA program to insert 5 records in BANK table with column ("AccountNo","AccountBal")  using prepared statement*/

package SQL;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Exercise2 {

	static final String DB_URL = "jdbc:mysql://localhost/SQLAnuja";
	static final String USER = "root";
	static final String PASS = "1234";
	 
 public static void main(String[] args) throws SQLException {
	
	 
	 Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	 Statement stmt = conn.createStatement();
	 
	 // Open a connection
      try{	
    	  String sql ="delete from Bank where AccountNo = 'BANK OF BARODA,KeshavNagar'";
    	  stmt.executeUpdate(sql);
    	  System.out.println("Rows deleted = "+ sql);	   
    	 
    	  String INSERT_RECORD = "insert into Bank(AccountName,AccountNo) values(?,?)";
    	    
    	    PreparedStatement pstmt = conn.prepareStatement(INSERT_RECORD);
    	    pstmt.setString(1, "Anuja");
    	    pstmt.setString(2, "8788023085");
    	    pstmt.execute();
    	    
    	    pstmt.setString(1, "kartik");
    	    pstmt.setString(2, "9767548");
    	    pstmt.execute();
    	    
    	    pstmt.setString(1, "Shilpa");
    	    pstmt.setString(2, "9876503");
    	    pstmt.execute();
    	    
    	    pstmt.setString(1, "Snehal");
    	    pstmt.setString(2, "9876504");
    	    pstmt.execute();
    	
    	    pstmt.setString(1, "Harsh");
    	    pstmt.setString(2, "9876505");
    	    pstmt.execute();
    	    
    	  
    	    System.out.println("Details Added Successfully ");
	      conn.close();
	        }
   catch (Exception exc)
	    {
	      exc.printStackTrace();
	    }
	 }}
	
