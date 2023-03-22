package com.maxtain.bootcamp.banking;

public class Savings extends Account {
	private double interestrate = 0.12;

	public double getInterestrate() {
		return interestrate;
	}

	public void setInterestrate(double interestrate) {
		this.interestrate = interestrate;
	}
	
	public void PayInterest(int months) throws Exception {
		var interest = calculateInterest(months);
		deposit(interest);
	}
	private double calculateInterest(int months) {
		if(months < 1) {
			return 0;
		}
		return getBalance() * (getInterestrate()/12)*months;
	}
	public Savings(String description) {
		super(description);
	}
	public Savings() {
		
	}
}
