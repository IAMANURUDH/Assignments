/**
 * 
 */
package com.jdbc.JdbcApp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

/**
 * @author T00782
 *
 */
public class CallableExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = null;
		Connection con = null;
		CallableStatement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hughes", "root", "Welcome@12345");
			stmt = con.prepareCall("{call myprocedure1(?,?) }");
			stmt.setInt(1, 101);
			stmt.registerOutParameter(2, java.sql.Types.VARCHAR);
			boolean status = stmt.execute();
			System.out.println(stmt.getString(2));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
