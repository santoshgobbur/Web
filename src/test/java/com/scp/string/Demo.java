package com.scp.string;

import java.util.HashMap;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {
	
		
		String s = new String("Hi");
		String t = new String("Hi");
		System.out.println(s==t);
		System.out.println(s.equals(t));
		
		String s1 = "Hi";
		String s2 = "Hi";
		System.out.println(s1==s2);
		System.out.println(s1==s);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s));
		
		String ss = new String("Hi");
		System.out.println(ss.concat("hello"));
		//System.out.println(ss);
		String d = ss.concat("hello");
		System.out.println(d);
		
		Map<String,Map<String,String>> sm = new HashMap<>();
		
	}

}
