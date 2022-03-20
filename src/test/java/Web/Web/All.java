package Web.Web;

import java.util.HashMap;
import java.util.Map;

import org.testng.xml.ISuiteParser;

public class All {

	public static void main(String[] args) {
	
	    // 	Reverse string
		String str = "Java";
		String rev = "";
		for(int i=str.length()-1; i>=0; i--){
			
			rev = rev + str.charAt(i);
		}
	   System.out.println(rev);

	   // Reverse each word in string
	   
	   String st = "My name is santosh";   
	   String w[] =  st.split(" ");
	   String revst = "";

	   for(String word:w) {
		   
		   String wo= "";
		   
		   for(int y=word.length()-1; y>=0;y--) {
			   
			   wo = wo + word.charAt(y);
		   }
		   revst = revst+wo+" ";
	   } 
	   System.out.println("Reverse each word in string " +revst);
	   
	   // Occurances of characters in string
	   
	   String strr = " my name is java";
	   
	   Map<Character,Integer> m = new HashMap<Character,Integer>();
	   
	   char ch[] =  strr.toCharArray();
	   
	   for(char c:ch) {
		   
		   if(m.containsKey(c)) {
			   m.put(c, m.get(c)+1);
		   }
		   else {
			   m.put(c, 1);
		   }
	   }
	   System.out.println("Occurances of characters in string " +m);

	   // Reverse number
	   
	   int num = 1234;
	   int revnum = 0;
	   
	   while(num!=0) {  
		   revnum = revnum*10 + num%10;
		   num = num/10;
	   }
	   System.out.println("Reverse number " +revnum);
	   
	   // Largest number & smallest number in array
	   
	   int a[] = {12,42,23,54,24,60};
	   int smallest = a[0];
	   int largest = a[0];
	   
	   for(int j=1;j<a.length;j++){
		   
		   if(a[j]>largest) {
			   largest= a[j];
		   }
		   else if(a[j]<smallest) {
			   smallest = a[j];
		   }
		   
	   }  
	  System.out.println("Smallest number " +smallest);
	  System.out.println("Largest number " +largest);


	    
	  // String reverse with Recursion
    All aa = new All();
    String d = "Selenium";
    System.out.println(aa.recursionString(d));
    
	  // Palindrome
	   
	   if(isPalindrome("saras")){
		   System.out.println(" String is palindrome");
	   }
	   else {
		   System.out.println("String is not palindrome");
	   }
	  
	}
     
	public static boolean isPalindrome(String pal) {
	
		int h = 0;
		int l = pal.length()-1;
		
		while(h<l) {
			
			if(pal.charAt(h)!=pal.charAt(l)) {
				return false;
			}
			h++;
			l--;
		}
		return true;
	}
	
	public String recursionString(String ss) {
		
		if(ss==null||ss.length()<=1) {
			System.out.println(ss);
		}
		else {
			
			System.out.println(ss.charAt(ss.length()-1));
			recursionString(ss.substring(0,ss.length()-1));
			
		}
	   return ss;
	}
	
}

