package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day3 {
	
	@Test
	public void mobileSignUp() {
		System.out.println("Sign up Page");
	}
	@Test
	public void mobileLoginIn() {
		System.out.println("Login Page");
	}
	@Test(groups = {"Smoke"})
	public void mobileLogOut() {
		System.out.println("log Out Successful");
	}
	@Test(groups = {"Smoke"})
	public void reset() {
		System.out.println("Password Reset");
	}
	@Test(groups = {"Smoke"})
	public void delete() {
		System.out.println("Delete Account");
	}
	
	@BeforeMethod
	public void beforeEveryMethod() {
		System.out.println("Verifying before test methods in Day 3 Class");
	}
	@AfterMethod
	public void afterEveryMethod() {
		System.out.println("Verifying After test methods in Day 3 Class");
	}
}

