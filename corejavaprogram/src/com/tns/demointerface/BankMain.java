package com.tns.demointerface;

public class BankMain {

	public static void main(String[] args) {
	 
		Bank bank=new Bankimple();
		
		Account account=new Account(202,"umama",1500,bank);
		
		bank.withdraw(account, 500);
		bank.deposit(account,20000);

		
	}

}
