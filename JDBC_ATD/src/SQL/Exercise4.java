/*	Exercise 4 : Write a JAVA program to get  connection object using hostname , user,password 
   stored in external properties file. */

package SQL;

import java.io.FileInputStream;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;


public class Exercise4 {
	 
	public static void main(String[] args) throws IOException, SQLException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\Downloads\\JDBC_ATD\\src\\SQL\\config.properties");
		Properties dbProperties = new Properties();
		dbProperties.load(fis);
		String HOSTNAME = dbProperties.getProperty("db.host");
		String USER = dbProperties.getProperty("db.login");
		String PASSWORD = dbProperties.getProperty("db.password");
		
		
	 
	}
	}
	
