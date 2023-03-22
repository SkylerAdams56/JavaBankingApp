package com.maxtain.bootcamp.banking;

public class MainLine {

	public static void main(String[] args) {
		
		try {
			
			var account = new Account();
			account.deposit(1000);
			System.out.printf("%s", account.toString());
			//System.out.println("Balance is " + account.getBalance());
			account.withdraw(500);
			System.out.printf("%s", account.toString());
			
			var account2 = new Savings("Savings Account");
			account.transfer(100, account2);
			System.out.printf("%s%s",
					account.toString(), account2.toString());
			account2.PayInterest(3);
			System.out.printf("%s", account2.toString());
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
