package domain;

public class Account {
	
	private double balance;
	
	public Account(double balance) {
		this.setBalance(balance);
	}

	/**
	   * Returns user's current account balance
	   * @return balance
	   */ 
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/**
	   * Inserts a certain amount money from account. 
	   * @param amount
	   */ 
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	/**
	   * Removes a certain amount money from account. 
	   * Note: This method does not handle any error checking. To make sure enough money exists on account, use getBalance() method. 
	   * @param amount
	   */ 
	
	public void withdraw(double amount) {
		balance -= amount;
	}
}
