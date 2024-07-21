package com.rakesh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

public class Batch_Update_Ps {

	public static void main(String[] args) {
	
		String dburl ="jdbc:mysql://localhost:3306/testdb";
		String dbuser ="root";
		String dbpassword ="rakesh301";
		
		try {
			Connection conn = DriverManager.getConnection(dburl, dbuser, dbpassword);
			String sql ="insert into student values(?,?,?)";
			
			PreparedStatement ps =conn.prepareStatement(sql);
			ps.setInt(1,1);
			ps.setString(2, "rakhi");
			ps.setString(3,"rakhi@gmail.com");
			
			ps.addBatch();
			
			ps.setInt(1,7);
			ps.setString(2, "ganesh");
			ps.setString(3,"ganesh@gmail.com");
			
			ps.addBatch();
			
			int [] count = ps.executeBatch();
			System.out.println(Arrays.toString(count));
			System.out.println("Done....");
			
			
			
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
;
	}

}
