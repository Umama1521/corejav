package com.tns.scannerclass;

import java.util.Scanner;

public class Personexec {
 public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	 
	 System.out.println("enter your name");
	 String name=sc.next();
	 
	 System.out.println("enter your income");
	 int income=sc.nextInt();
	 
	 Personjava pp=new Personjava();
	 
	 pp.setName(name);
     pp.setIncome(income);
	 
	 Taxcalculation t=new Taxcalculation();
	 
	 t.calculatetax(pp);
	 System.out.println("after calcu tax");
	 System.out.println(pp);
	 
	 
}
 
}
