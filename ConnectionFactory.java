package co.edureka.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;


public class ConnectionFactory {

	private static Connection con=null;
	
	public static Connection getConnection() {
		if(con==null) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				 con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","java31","password");
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}return con;
	}
}
