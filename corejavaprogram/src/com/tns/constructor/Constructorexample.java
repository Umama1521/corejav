package com.tns.constructor;
 // demo for constructor

public class Constructorexample {
	
	Constructorexample(){
		System.out.println("default constructor");
	}
	  
	Constructorexample(int i){
		System.out.println("constructor with one parameter");
	}
	Constructorexample(int i , int j){
		System.out.println("constructor with two parameter");
	}
	 
    Constructorexample(String s, int i){
    	System.out.println("constructor with diff datatype");
    
    }

    public static void main(String[] args)  {
		Constructorexample e=new Constructorexample ();
		Constructorexample e1=new Constructorexample (2);
		Constructorexample e3=new Constructorexample (3,5);
		Constructorexample e4=new Constructorexample ("umama",7);

    }		
}
	
    
