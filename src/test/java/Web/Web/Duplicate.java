package Web.Web;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		
		// Duplicate elements in array
		int a[] = {1,2,3,4,5,5,6,6,7};
		Set<Integer> s = new HashSet<Integer>();
		for(int i:a) {
			if(s.add(i)==false) {
				System.out.println("Duplicate element in array " +i);
			}
		}
		
		String names[] = {"java","c","java","python"};
		Set<String> ss = new HashSet<String>();
		for(String name:names) {
			if(ss.add(name)==false) {
				System.out.println("Duplicate element in array " +name);
			}
		}
		
	   // Occurances of elements in array
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i:a) {
			
			if(map.containsKey(i)) {
				
				map.put(i,map.get(i)+1);
			}
			else {
				map.put(i,1);
			}
		
		}
		
	    System.out.println(map);
		
		
	}

}
