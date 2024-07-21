package com.rakesh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class Batch_Update_St {

	public static void main(String[] args) throws SQLException {
	String dbURL ="jdbc:mysql://localhost:3306/testdb";
	String dbUser ="root";
	String dbPassword ="rakesh301";
	
	Connection conn =null;
	try {
		conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Statement st = null;
	try {
		st = conn.createStatement();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String sql1 ="delete from student where sid =1";
	String sql2 ="delete from student where sid=13";
	
	try {
		st.addBatch(sql1);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		st.addBatch(sql2);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	int [] counts = st.executeBatch();
	
	System.out.println(Arrays.toString(counts));
	
	System.out.println("Done....");
	
	
	

	}

}
