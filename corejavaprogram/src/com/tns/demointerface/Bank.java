package com.tns.demointerface;
// demo for interface
public interface Bank {

	// final variable
	public double MINBAL=2000;
	public double DEPOSIT_LIMIT=20000;
	
	// interface will not allow instance variables
	//public int accid;
	
	void withdraw(Account account,double amount);
	void deposit(Account account,double amount);

	// interface will not allow concrete method
	// void show(){
	}
