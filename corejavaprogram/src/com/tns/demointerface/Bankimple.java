package com.tns.demointerface;
// program for bank implementation
public class Bankimple implements Bank {

	@Override
	public void withdraw(Account account, double amount) {
		
   if(account.getBalance()-amount>=MINBAL) {
   
   account.setBalance(amount);
   System.out.println("The balance after withdraw is"
   +account.getBalance());
		
	}
	else {
		System.out.println("Insuficient balance to withdraw");
	}
	
	}

	@Override
	public void deposit(Account account, double amount) {
		if(amount>DEPOSIT_LIMIT) {
			System.out.println("Deposit limit is exceeding");
		
	}
		else {
			account.setBalance(account.getBalance()+amount);
			System.out.println("The amount after deposit is"+account.getBalance());
		}

}
}