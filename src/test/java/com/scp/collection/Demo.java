package com.scp.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
	
		List l = new ArrayList();
		
		l.add("125");
		l.add("java");
		l.add("how are you");
		l.add("how are you");
		System.out.println(l);
		System.out.println(l.contains("hi"));
	
		Iterator itr = l.iterator();
		System.out.println(itr.hasNext());
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		Set<Object> s = new HashSet<Object>();
		
		System.out.println("/---Set---/");
		s.add(24);
		s.add("Santosh is");
		s.add("SAS Institue Employee");
		s.add("Level 2A");
		s.add("Magarpatta Cybercity Tower 5 Pune");

		System.out.println(s);
		
		Iterator itrr = s.iterator();
        while(itrr.hasNext()) {
			
			System.out.println(itrr.next());
		}
  
        Map<String,String> hm = new HashMap<String,String>(); 
        hm.put("UK", "London");
        hm.put("India", "New Delhi");
        hm.put("France", "Paris");
        
        System.out.println(" Way 1 ");
        
        Iterator<String> it1 =  hm.keySet().iterator();
        
        while(it1.hasNext()) {
        	
        	String key = it1.next();
        	String value = hm.get(key);
        	System.out.println("Key = " +key+ " and Value = " +value);
        	
        }
        
        System.out.println(" Way 2");  
        Iterator<Entry<String, String>> it2 = hm.entrySet().iterator();
        while(it2.hasNext()) {
        	
        	Entry<String, String> entry = it2.next();
        	System.out.println("key = "+entry.getKey()+ " and Value = " +entry.getValue());
        	
        }
        
        System.out.println( "Way 3");
        hm.forEach((k,v) -> System.out.println(" Key = " +k+ " and Value = "+v));
        
	
   
        int[] myList = {2,4,6,5,7};
        
        for(int ll=0;ll<myList.length; ll++) {
        	System.out.println("Even indices" +myList[ll]);
        	ll = ll+1;
        }
        for(int ll=1;ll<myList.length; ll++) {
        	System.out.println("Odd indices" +myList[ll]);
        	ll = ll+1;
        }
        
    	for(int n=0; n<myList.length;n++) {
    		
    	 if((myList[n] % 2)==0) {
    		System.out.println("Even number " +myList[n]);
    	  }
    	 else {
    		 System.out.println("Odd number " +myList[n]);
    	 }
	
	}
    	
    	

	
	}
}


