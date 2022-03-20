package Web.Web;

import java.util.HashMap;
import java.util.Map;

public class Pgm {

	public static void main(String[] args) {
	
		
		String s = "My name is Santosh name";	
		String[] w = s.split(" ");
		
		// length of words in string
		Map<String,Integer> h = new HashMap<String,Integer>();
		for(String d:w){
			
			if(!h.containsKey(d)) {
				h.put(d, d.length());
			}
		}
		System.out.println("Length of each word in string " +h);
		
		// Count of occurances of word in string
		Map<String,Integer> c = new HashMap<String,Integer>();
		for(String f:w){
	        
			if (c.containsKey(f)){
				c.put(f, c.get(f)+1);
			}
			else {
				c.put(f,1);
			}
			
		}
		System.out.println("Occurances of word in string " +c);
	
		
		Map<Character,Integer> chr = new HashMap<Character,Integer>();
		String ss= "My program is java";
		char[] ch = ss.toCharArray();
		for(char cc:ch){
			
			if(chr.containsKey(cc)) {
				chr.put(cc, chr.get(cc)+1);
			}
			else {
				chr.put(cc, 1);
			}
			
		}
		System.out.println("Occurances of chars in string " +chr);
		
		// Reverse each word in string
		String revs ="";
		for(String t:w){
			
			String rev="";
			for(int i=t.length()-1; i>=0; i--) {
					
					rev = rev+t.charAt(i);
				}
			 revs = revs+rev+" ";
		    }
		    System.out.println(revs);
		}
	}


