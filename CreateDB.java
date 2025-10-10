package package_1;

import java.sql.*;

public class CreateDB {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/";
	
	//DB User & Pass
	static final String USER = "icarus";
	static final String PWD = "pinkman777";
	
	public static void main(String[] args) {
		
		Connection con = null;
		Statement statement = null;
		
		try {
			Class.forName(JDBC_DRIVER); //Register JDBC Driver
			
			//Open Connection
			System.out.println("Connecting...");
			con = DriverManager.getConnection(DB_URL, USER, PWD);
			
			System.out.println("Creating Database...");
			statement = con.createStatement();
			
			String sql = "Create database student11";
			boolean result = statement.execute(sql);
			System.out.println(result);
			System.out.println("...Database Created...");
			
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(statement != null) {
					statement.close();
				}
				if(con != null) {
					con.close();
				}
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
}
