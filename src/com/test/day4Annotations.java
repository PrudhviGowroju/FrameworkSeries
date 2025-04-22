package com.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day4Annotations {
	
	@BeforeSuite
	public void bsuite() {
		System.out.println("I'm the starting point");
	}
	
	@BeforeTest
	public void prerequisites() {
		System.out.println("PreRequisites to be excuted first");
	}
	
	@BeforeMethod
	public void beforeEveryMethod() {
		System.out.println("Before every method is specific to class day 4 file and excutes before every method");
	}
	
	/* What is the difference between before method and after method : 
	 - BeforeMethod: Before every method is specific to class file and excutes before every method
	 - BeforeTest : Depends on TestNg xml file based on test folder scope
	 */
	 
	
	@AfterTest
	public void postrequisites() {
		System.out.println("Post checks after test");
	}
	
	@BeforeTest
	public void check() {
		System.out.println("Verify whether it is updating ?");
	}
	
	@Test
	public void Verify() {
		
		System.out.println("Annotations Check");
	}
	
	@AfterTest
	public void Verify2() {
		
		System.out.println("After test 2");
	}
	@AfterSuite
	public void afSuite() {
		System.out.println("I'm the last");
	}
}


