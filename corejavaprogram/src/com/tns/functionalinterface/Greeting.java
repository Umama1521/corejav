package com.tns.functionalinterface;
// demo for Functional interface
@FunctionalInterface
public interface Greeting {

	// abstract method 9SAM)
	
   void greet();
   default void show() {
}

   default void print() {
   }
   }