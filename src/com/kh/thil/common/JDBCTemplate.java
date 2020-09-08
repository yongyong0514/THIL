package com.kh.thil.common;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCTemplate {
	public static Connection getConnection() {
		Connection con = null;
		Properties prop = new Properties();
		
		String fileName = JDBCTemplate.class.getResource("/sql/driver.properties").getPath();
		
		try {
			prop.load(new FileReader(fileName));
			
			String driver = prop.getProperty("driver");
			String url = prop.getProperty("url");
			String user = prop.getProperty("user");
			String password = prop.getProperty("password");
			
//			System.out.println(driver);
//			System.out.println(url);
//			System.out.println(user);
//			System.out.println(password);
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			con.setAutoCommit(false);
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}

	public static void close(Connection con) {

		try {
			if (con != null && !con.isClosed()) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(Statement stmt) {

		try {
			if (stmt != null && !stmt.isClosed()) {
				stmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(ResultSet rset) {

		try {
			if (rset != null && !rset.isClosed()) {
				rset.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void commit(Connection con) {

		try {
			if (con != null && !con.isClosed()) {
				con.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void rollback(Connection con) {

		try {
			if (con != null && !con.isClosed()) {
				con.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
