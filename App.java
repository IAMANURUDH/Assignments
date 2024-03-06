package com.bank.AbcdBank;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
/**
*
* @author Anurudh Gupta
*
*/
public class App {
  static Connection conn = null;
  static PreparedStatement ps = null;
  static ResultSet rs = null;
 
  // Main method to start the application
  /**
   * @param args
   */
  public static void main(String[] args) {
    try {
      connectToDatabase();
      Scanner sc = new Scanner(System.in);
      int choice;
      do {
        displayMenu();
        choice = sc.nextInt();
        switch (choice) {
        case 1:
          openNewAccount();
          break;
        case 2:
          modifyPersonalDetails();
          break;
        case 3:
          displayAccountInformation();
          break;
        case 4:
          closeAccount();
          break;
        case 5:
          System.out.println("Exiting...");
          break;
        default:
          System.out.println("Invalid choice. Please enter a number from 1 to 5.");
        }
      } while (choice != 5);
      closeDatabaseConnection();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
 
  // Connect to the database
  static void connectToDatabase() throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.cj.jdbc.Driver");
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/abcdbank", "root", "1234");
  }
 
  // Close the database connection
  static void closeDatabaseConnection() throws SQLException {
    if (conn != null) {
      conn.close();
    }
  }
 
  // Display the menu options
  static void displayMenu() {
    System.out.println(
        "Bank Account Menu: \n\n1.)Open New Account \n2.)Modify Personal Details \n3.)Display Account Information \n4.)Close Account \n5.)Exit \n\nEnter your choice: ");
  }
 
  // Method to open a new account
  static void openNewAccount() {
    try {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter customer name: ");
      String name = sc.nextLine();
      System.out.print("Enter account type(Savings/Current): ");
      String acctype = sc.nextLine();
      System.out.print("Enter deposit balance: ");
      double deposit = sc.nextDouble();
      if (deposit < 1000) {
        System.out.println("\nLess balance. Minimum balance should be 1000.\n");
        return;
      }
      String insertQuery = "INSERT INTO account (name, acctype, deposit, opening_date) VALUES (?, ?, ?, CURDATE())";
      ps = conn.prepareStatement(insertQuery, PreparedStatement.RETURN_GENERATED_KEYS);
      ps.setString(1, name);
      ps.setString(2, acctype);
      ps.setDouble(3, deposit);
      ps.executeUpdate();
      ResultSet generatedKeys = ps.getGeneratedKeys();
      int accountNumber = -1;
      if (generatedKeys.next()) {
        accountNumber = generatedKeys.getInt(1);
      }
      if (accountNumber != -1) {
        System.out.println("New account opened successfully.");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + acctype);
        System.out.println("Customer Name: " + name);
        System.out.println("Deposit Balance: Rs." + deposit);
      } else {
        System.out.println("Failed to retrieve account information.\n");
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
 
  // Method to modify personal details
  static void modifyPersonalDetails() {
    try {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter account number: ");
      int accountNumber = sc.nextInt();
      String checkAccountQuery = "SELECT * FROM account WHERE account_number = ?";
      ps = conn.prepareStatement(checkAccountQuery);
      ps.setInt(1, accountNumber);
      rs = ps.executeQuery();
      if (!rs.next()) {
        System.out.println("Account not found.\n");
        return;
      }
      System.out.print("Enter new customer name: ");
      String newName = sc.nextLine();
      System.out.print("Enter account type: ");
      String newAcctype = sc.nextLine();
      System.out.print("Enter new balance: ");
      double newDeposit = sc.nextDouble();
      String updateQuery = "UPDATE account SET name = ?, acctype = ?, deposit = ? WHERE account_number = ?";
      ps = conn.prepareStatement(updateQuery);
      ps.setString(1, newName);
      ps.setString(2, newAcctype);
      ps.setDouble(3, newDeposit);
      ps.setInt(4, accountNumber);
      ps.executeUpdate();
      System.out.println("Personal details modified successfully.\n");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
 
  // Method to display account information
  static void displayAccountInformation() {
    try {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter account number: ");
      int accountNumber = sc.nextInt();
      String selectQuery = "SELECT * FROM account WHERE account_number = ?";
      ps = conn.prepareStatement(selectQuery);
      ps.setInt(1, accountNumber);
      rs = ps.executeQuery();
      if (rs.next()) {
        System.out.println("Account Number: " + rs.getInt("account_number"));
        System.out.println("Customer Name: " + rs.getString("name"));
        System.out.println("Account Type: " + rs.getString("acctype"));
        System.out.println("Balance: Rs." + rs.getDouble("deposit"));
        System.out.println("Opening Date: " + rs.getDate("opening_date"));
      } else {
        System.out.println("Account not found.\n");
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
 
  // Method to close an account
  static void closeAccount() {
    try {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter account number: ");
      int accountNumber = sc.nextInt();
      String checkAccountQuery = "SELECT opening_date FROM account WHERE account_number = ?";
      ps = conn.prepareStatement(checkAccountQuery);
      ps.setInt(1, accountNumber);
      rs = ps.executeQuery();
      if (rs.next()) {
        java.util.Date openingDate = rs.getDate("opening_date");
        java.util.Date currentDate = new java.util.Date();
        long differenceInMilliseconds = currentDate.getTime() - openingDate.getTime();
        long differenceInDays = differenceInMilliseconds / (1000 * 60 * 60 * 24);
        if (differenceInDays < 60) {
          System.out.println("You are not allowed to close the account. \nMinimum account age is 60 days.\n");
        } else {
          System.out.println("Account closed successfully.\n");
        }
      } else {
        System.out.println("Account not found.\n");
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}