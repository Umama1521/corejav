package com.tns.markerinterface;

public class MarkerMain {

	public static void main(String[] args) {
		
  Student ob=new Student(202,"UMAMA","EEE");
		
		if(ob instanceof Register)
			System.out.println("Student is reistered");
		else
			System.out.println("Student is not registered");
		

	}

}
