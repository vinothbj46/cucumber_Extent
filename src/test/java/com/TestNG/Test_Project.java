package com.TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Test_Project {
	@Test
	private void login() {
		System.out.println("Login");
		
	}
	@Test
	@Ignore
private void logout() {
		System.out.println("Logout");

}
	@Test(enabled = false)
	private void user_Login() {
		System.out.println("User Login SuccessFully");
	}
	@Test
	private void user_Logout() {
		System.out.println("User Logout Successfully");
	}
}














