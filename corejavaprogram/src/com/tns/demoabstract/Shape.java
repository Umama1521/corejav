package com.tns.demoabstract;
// demo for abstract
public abstract class Shape {
	
	public float area;
	
 // abstract method
	abstract void calArea();
	
	// concrete method
	public void show() {
		System.out.println("The area is"+area);
	}
	
}
