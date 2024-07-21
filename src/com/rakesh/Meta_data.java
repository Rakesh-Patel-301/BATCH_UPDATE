package com.rakesh;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Meta_data {

	public static void main(String[] args) throws SQLException {
		String dburl ="jdbc:mysql://localhost:3306/testdb";
		String dbuser ="root";
		String dbpassword ="rakesh301";
		
		Connection conn = DriverManager.getConnection(dburl, dbuser, dbpassword);
		DatabaseMetaData metadata = conn.getMetaData();
		System.out.println(metadata.supportsBatchUpdates());
		System.out.println("Done....");
		
		

	}

}
