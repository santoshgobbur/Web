package com.scp.testng;

import org.testng.annotations.Test;

public class A {
	
    @Test(priority=1)
	public void aa() {
		System.out.println("First");
	}
	
	@Test(priority=-1)
	public void second() {
		System.out.println("Second");
	}
	
	@Test
	public void bs() {
		System.out.println("Third");
	}
	
	@Test(priority=1)
	public void pa() {
		
		System.out.println("App");
		
	}
	

}
