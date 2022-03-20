package com.scp.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;

public class Demo2 {

	public static void main(String[] args) {
		
	
		List<Integer> l = new ArrayList<>();		
		for(int i=0;i<10;i++){
			
			l.add(i);
			
	   }
	   System.out.println(l);
	   
	   Iterator<Integer> itr = l.iterator();
	  
	   while(itr.hasNext()){
		   
		  int j = itr.next();
		  
		  if(j%2!=0){
			  itr.remove();
		  }
	   }
	   
	   System.out.println(l);
	   
   }
	
}