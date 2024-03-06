package com.jdbc.JdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Jdbc Connectivity.
 */
public class App {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hughes", "root", "Welcome@12345");
			System.out.println("Connection established successfully\n");
			System.out.println("Aadhar_No.      " + "Firstname " + "Lastname " + "Pincode  " + "Address     " + "Mobile_No.  \n");
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from aadhar");
			while (rs.next())
				System.out.println(rs.getBigDecimal(1) + "    " + rs.getString(2) + "  " + rs.getString(3) + "    " + rs.getString(4) + "    "  + rs.getString(5) + "    " + rs.getBigDecimal(6));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
//		 ---------------------------------------For insert ----------------------
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hughes", "root", "Welcome@12345");
		stmt=con.createStatement();  
		int status = stmt.executeUpdate("insert into employee(emptid,ename,age) values(104,'Anurudh',21)");
		if(status > 0) {
			System.out.println("Record successfully saved");
		}
		else
			System.out.println("Record failed to save");
		}
		catch (Exception e){
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		 -------------------- For Update --------------
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hughes", "root", "Welcome@12345");
			stmt = con.createStatement();
			int status = stmt.executeUpdate("update employee set ename=\"Srinivas\" where emptid=103");
			if (status > 0) {
				System.out.println("Record update");
			} else
				System.out.println("Record not update");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

//		--------------------For delete----------------
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hughes", "root", "Welcome@12345");
			stmt = con.createStatement();
			int status = stmt.executeUpdate("delete from employee where emptid=102");
			if (status > 0) {
				System.out.println("Record deleetd");
			} else
				System.out.println("Record not delete");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
