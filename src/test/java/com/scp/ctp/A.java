package com.scp.ctp;

public class A {

	public static void main(String[] args) {
	     
		B b = new B();
		b.m1(24);
		b.m1(10.5f);
		b.m1('c');            
		b.m1(6l);
		b.m2(24, 42);
		b.m2(24.0f, 42.0f);
		b.m3(5.5f, 24);
		b.m3(24, 24.12f);

		B hb = new C();
		hb.print('d');
	}

}

class B {
	
	public void m1(int a) {
		
		System.out.println("int version");
	}
    public void m1(float a) {
		
		System.out.println("float version");
	}
    
    public void m2(int b, int c) {
    	
    	System.out.println(" int int version");
    }
    public void m2(float d, float e) {
    	
    	System.out.println(" float float version");
    }
    public void m3(int f, float g) {
    	
    	System.out.println(" int float version");
    }
    public void m3(float h, int i) {
    	
    	System.out.println(" float int version");
    }
    
    public void print(char c) {
    	System.out.println(" print B ");
    }
     
}

class C extends B{
	
	 public void print(char s) {
	    	System.out.println(" print C ");
	    }
}


