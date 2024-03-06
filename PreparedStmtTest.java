/**
 * 
 */
package com.jdbc.JdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author Anurudh Gupta
 *
 */
public class PreparedStmtTest {

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
			System.out.println("Enter name : ");
			String name = sc.next();
			System.out.println("Enter id : ");
			int id = sc.nextInt();
			stmt = con.prepareStatement("Update employee set ename =? where emptid = ?");
			stmt.setString(1, name);
			stmt.setInt(2, id);
			int status = stmt.executeUpdate();
			if (status > 0) {
				System.out.println("Updated successfully");
			} else {
				System.out.println("Not updated");
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
