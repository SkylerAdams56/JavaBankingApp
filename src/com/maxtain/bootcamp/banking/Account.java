package com.maxtain.bootcamp.banking;

public class Account {
	
	
	private static int nextId = 1;
	public void deposit(double amount) throws Exception {
		checkAmountGTZero(amount);
		setBalance(getBalance() + amount);
	}
	public void withdraw(double amount) throws Exception {
		checkAmountGTZero(amount);
		checkInsufficientFunds(amount);
		setBalance(getBalance() - amount);
	}
	public void transfer(double amount, Account toAccount) throws Exception {
		withdraw(amount);
		toAccount.deposit(amount);
		
	}
	private void checkAmountGTZero(double amount) throws Exception {
		if(amount <= 0) {
			throw new Exception("Amount must be positive");
		}
	}
	private void checkInsufficientFunds(double amount) throws Exception {
		if(amount > getBalance()) {
			throw new Exception("Insufficient funds");
		}
	}
	public String toString() {
		return String.format("%2d | %-15s | %,7.2f%n", getAcctId(), getDescription(), getBalance());
	}
	public Account(String description) {
		setAccountid(nextId++);
		setDescription(description);
		setBalance(0);
	}
	public Account() {
		this("New Account");
	}
	
	private int accountid = 0;
	public int getAcctId() {
		return this.accountid;
	}
	private void setAccountid(int accountid){
		this.accountid = accountid++;
	}
	
	private String description;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	protected double balance = 0;
	public double getBalance() {
		return balance;
	}
	public String getBalanceFormatted() {
		return String.format("%, 7.2f", getBalance());
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	
}
