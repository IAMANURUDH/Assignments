/**
 * 
 */
package com.jdbc.JdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.io.FileInputStream;

/**
 * @author Anurudh Gupta
 */
public class InsertPicture {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = null;
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hughes", "root", "Welcome@12345");
			sc = new Scanner(System.in);
			stmt = con.prepareStatement("insert into profile values(?,?)");
			stmt.setString(1, "getmethod");
			FileInputStream fs = new FileInputStream("C:\\profile\\getmethod.png");
			stmt.setBinaryStream(2, fs);
			int status = stmt.executeUpdate();
			if (status > 0) {
				System.out.println("Image upload successfully");
			} else {
				System.out.println("Not uploaded");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				sc.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
