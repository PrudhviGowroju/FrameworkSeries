package com.test;

import org.testng.annotations.Test;

public class day1 {
	
	/* To run any program we use 
	 * 	public static void main (string args [])
	 * with out this we can run using TestNg
	 * all that needs is a method with Annotation
	 * 
	 * How to create Test Ng Framework 

1. Create a Java Project  
2. Create a class without Main Method
3. give @Test annotation above the method, and mouse over on the @Test it will ask for **add TestNg library** and add it 
4. Again mouse hover on the @Test and again add import org.testng.annotations.Test

Issues faced: 

If we have any [module-info.java](http://module-info.java) then Test Ng doesn’t work. 

So we did removed it and it worked*/
	@Test	
	public void Demo() {
		System.out.println("Hello");
	}
	
}
