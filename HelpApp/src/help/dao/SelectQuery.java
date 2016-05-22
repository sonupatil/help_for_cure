package help.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

import help.models.User;


public class SelectQuery {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/help_app";
    static final String USER = "root";
    static final String PASS = "root";
	
	public static User getLoggedUser(String userName, String pass){
		User op = null;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
			
		  //STEP 2: Register JDBC driver
	      try {
			Class.forName("com.mysql.jdbc.Driver");
	
			conn = (Connection)DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = (Statement)conn.createStatement();
			String sql = "SELECT * FROM help_app.users where mobile_number='"
					+ userName
					+ "' and password='"
					+ pass
					+ "'";
			 rs = ((java.sql.Statement) stmt).executeQuery(sql);
		     if(rs != null && rs.next()){
		    	 op = new User(rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getString("password"), rs.getString("mobile_number"), rs.getString("user_type"), rs.getBoolean("status"));
		     }
		     
	  	} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return op;
	}
	
	
	
	/*
	public static void main(String[] args){
	
		System.out.println(getLoggedUser("8855002007", "Swap@124").getEmail());
	
	}
	*/

	
}
