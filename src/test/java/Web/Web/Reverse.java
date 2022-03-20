package Web.Web;
import org.openqa.selenium.Alert;

public class Reverse {

	public static void main(String[] args) {
	  
        System.out.println("String recursion ");
        Reverse r = new Reverse();
        r.reverseRecursion("Myname");
		System.out.println("//--------////");
		System.out.println("Palindrome");

		if (isPalindrome("saras")) 
	            System.out.print("String is palindrome"); 
	        else
	            System.out.print("String is not palindrome"); 
		
		// Reverse each word in string
		String s= "Hi Java";
		String[] word = s.split(" ");
		String revword= "";
		for(String w:word) {
			String wo= "";
			for(int i=w.length()-1;i>=0;i--) {
				wo = wo+w.charAt(i);
				
			}
			revword = revword+wo+" ";
		}
		
		System.out.println("//--------//");
		System.out.println("Reverse each word in string " +revword);
		
		// Reverse String
		System.out.println("//--------//");
		System.out.println("Reverse string");
		String[] str = s.split(" ");
		String revstr="";
		for(int j=str.length-1; j>=0;j--) {
			
			revstr=revstr+str[j]+" ";
		}
		revstr=revstr+" ";
		System.out.println(revstr);
	    
		// Reverse Integer
		int num=1234;
		int reversed =0;
        while(num != 0) {
            reversed = reversed * 10 + num%10;
            num =num/10;
        }
        
        System.out.println("//--------//");
		System.out.println("Reverse Integer");
        System.out.println(reversed);
        
        // Sort elements in array
        
        System.out.println("//--------//");
        
		System.out.println("Sorting");
        
        int a[]= {3,20,10,50,5};
        int temp=0;
        
        for(int i=0;i<a.length;i++) 
        {
        	for(int l=i+1;l<a.length;l++){
        		
        		if(a[i]>a[l]){
        			temp=a[i];
        			a[i]=a[l];
        			a[l]=temp;
        			
        		}
        		
        	}
        		
        }
        for(int i=0;i<a.length;i++) 
        {
           System.out.println(a[i]);
        }
        
        System.out.println("//--------//");
        System.out.println("Separate chars and integers in string");
		String ifsc ="SBIN3145";
		splitString(ifsc);
        
	}
	
	  // split
        static void splitString(String str) 
        { 
            StringBuffer alpha = new StringBuffer(); 
            StringBuffer number = new StringBuffer(); 
       //     StringBuffer special = new StringBuffer(); 
              
            for (int i=0; i<str.length(); i++) 
            { 
                if (Character.isDigit(str.charAt(i))) 
                    number.append(str.charAt(i)); 
                else if(Character.isAlphabetic(str.charAt(i))) 
                    alpha.append(str.charAt(i)); 
            } 
           
            System.out.println(alpha); 
            System.out.println(number); 
           // System.out.println(special); 
        } 
	
        // palindrome
        
        static boolean isPalindrome(String str) 
        { 
      
            // Pointers pointing to the beginning 
            // and the end of the string 
            int i = 0;
            int j = str.length() - 1; 
      
            // While there are characters toc compare 
            while (i < j) { 
      
                // If there is a mismatch 
                if (str.charAt(i) != str.charAt(j)) {
                	
                    return false; 
                } 
                // Increment first pointer and 
                // decrement the other 
                i++; 
                j--; 
            } 
      
            // Given string is a palindrome 
            return true;
        } 
        
        public void reverseRecursion(String str) 
        { 
            if ((str==null)||(str.length() <= 1)) 
               System.out.println(str); 
            else
            { 
                System.out.print(str.charAt(str.length()-1)); 
                reverseRecursion(str.substring(0,str.length()-1)); 
            } 
        } 
        

}
