package com.scp.testng;

import org.testng.annotations.Test;

public class Group {

	@Test(invocationCount=2)
	public void first() {
		
		System.out.println("first");
	}
	
	@Test(groups= {"Sanity"})
	public void sanity() {
		
		System.out.println("Sanity");
	}


}
