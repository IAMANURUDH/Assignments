/**
 * Bank Account Assignment
 */
package com.github.assignments;

import java.util.Random;

/**
 * @author Anurudh Gupta
 */

class Account {
	private String accountId;
	private String accountName;
	private String address;
	private double currentBalance;

	// Constructor to initialize account details
	public Account(String accountName, String address, double initialDeposit) {
		this.accountId = generateAccountId(); // Generate a unique account ID
		this.accountName = accountName;
		this.address = address;
		this.currentBalance = initialDeposit;
	}

	// Getter methods
	public String getAccountId() {
		return accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public String getAddress() {
		return address;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	// Method to display account details
	public void showDetails() {
		System.out.println("Account ID: " + accountId);
		System.out.println("Account Name: " + accountName);
		System.out.println("Address: " + address);
		System.out.println("Current Balance: " + currentBalance);
	}

	// Method to update the account balance
	public void updateBalance(double amount) {
		currentBalance += amount;
	}

	// Method to generate a unique account ID
	private String generateAccountId() {
		StringBuilder accountIdBuilder = new StringBuilder();
		Random random = new Random();
		// Generate 7 random digits
		for (int i = 0; i < 7; i++) {
			accountIdBuilder.append(random.nextInt(10));
		}
		// Generate 4 random capital letters
		for (int i = 0; i < 4; i++) {
			char randomChar = (char) (random.nextInt(26) + 'A');
			accountIdBuilder.append(randomChar);
		}
		return accountIdBuilder.toString();
	}
}

class Loan extends Account {
	private String loanId;
	private String loanType;
	private double loanAmount;

	// Constructor to initialize loan details
	public Loan(Account account, String loanType, double loanAmount) {
		super(account.getAccountName(), account.getAddress(), account.getCurrentBalance());
		this.loanId = generateLoanId(); // Generate a unique loan ID
		this.loanType = loanType;
		this.loanAmount = loanAmount;
	}

	// Getter methods
	public String getLoanId() {
		return loanId;
	}

	public String getLoanType() {
		return loanType;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	// Method to generate a unique loan ID
	private String generateLoanId() {
		// Generate a random UUID and return the first 8 characters
		return java.util.UUID.randomUUID().toString().substring(0, 8);
	}
}

class Transaction extends Loan {
	private double amount;
	private Account account;

	// Constructor to initialize transaction details
	public Transaction(Account account) {
		super(account, "", 0);
		this.account = account;
		this.amount = 0; // Initialize amount to 0
	}

	// Method to deposit amount into the account
	public void depositAmount(double deposit) {
		if (deposit > 0) {
			account.updateBalance(deposit); // Update the account balance with the deposit amount
			amount += deposit; // Add the deposit amount to the total transaction amount
			System.out.println("Deposited amount: " + deposit);
		} else {
			System.out.println("Invalid deposit amount. Please try again.");
		}
	}

	// Method to withdraw amount from the account
	public void withdrawAmount(double withdrawal) {
		if (withdrawal > 0 && withdrawal <= getCurrentBalance()) {
			account.updateBalance(-withdrawal); // Deduct the withdrawal amount from the account balance
			amount -= withdrawal; // Deduct the withdrawal amount from the total transaction amount
			System.out.println("Withdrawn amount: " + withdrawal);
		} else {
			System.out.println("Invalid withdrawal amount.");
		}
	}

	// Method to pay loan amount
	public void payLoan(double payment, String loanType, double loanAmount) {
		if (payment > 0 && payment <= loanAmount) {
			loanAmount -= payment; // Deduct the payment from the loan amount
			amount -= payment; // Deduct the payment from the total transaction amount
			System.out.println("Loan Payment: " + payment);
		} else {
			System.out.println("Invalid payment amount. Please try again.");
		}
	}

	// Method to display account details
	public void showAccountDetails() {
		System.out.println("Account Details:");
		showAccountDetails(); // Display the loan details
		System.out.println("Transaction Amount: " + amount); // Display the total transaction amount
	}
}

public class Taskone {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create an array of 10 different accounts
		Account[] accounts = new Account[10];
		
		accounts[0] = new Account("Anurudh Gupta", "Gwalior", 20000); // Create the first account
		accounts[1] = new Account("Anshika Singh", "Bhind", 45000); // Create the second account
		
		accounts[0].showDetails(); // Display details of the first account
		
		// Perform transactions on the first account
		Transaction transaction = new Transaction(accounts[0]);
		transaction.depositAmount(2000); // Deposit 2000 into the first account
		transaction.withdrawAmount(600); // Withdraw 600 from the first account
		@SuppressWarnings("unused")
		
		Loan loan = new Loan(accounts[0], "Home", 10000); // Create a loan for the first account
		Transaction loanTransaction = new Transaction(accounts[0]);
		loanTransaction.payLoan(1500, "Home", 2500); // Pay 1500 towards the home loan for the first account
		System.out.println();
		accounts[1].showDetails(); // Display details of the second account
		
		//Perform transactions one the second account
		Transaction transaction1 = new Transaction(accounts[0]);
		transaction1.depositAmount(10000); // Deposit 10000 into the first account
		transaction1.withdrawAmount(4000); // Withdraw 4000 from the first account
		@SuppressWarnings("unused")
		
		Loan loan1 = new Loan(accounts[1], "Car", 200000); // Create a loan for the second account
		@SuppressWarnings("unused")
		Transaction loanTransaction1 = new Transaction(accounts[1]);
		loanTransaction.payLoan(50000, "Car", 150000); // Pay 50000 towards the car loan for the second account
		System.out.println("\nAccount Information : \n");
		
		accounts[0].showDetails(); // Display information of the first account 
		System.out.println();
		accounts[1].showDetails(); // Display information of the second account
	}
}