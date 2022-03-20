 package Web.Web;

public class Practice {

	public static void main(String[] args) {
          
		
		int a[] = {45,20,30};
		int sum=0;
		int large=0;
		
		for(int s:a) {
			
			sum = sum + s;
			
		}
		
		//Initialize array  
        int [] arr = {25, 11, 7, 75, 56};  
        //Initialize max with first element of array.  
        int max = arr[0];  
        //Loop through the array  
        for (int i = 0; i < arr.length; i++) {  
            //Compare elements of array with max  
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Largest element present in given array: " + max);  
    
		
		System.out.println("largest number" +large);
		
		System.out.println("Sum of elements in array " +sum);

		String s = "Myjava";
		String[] str = s.split("");
		String rev= "";

			for(int i=str.length-1;i>=0;i--){
				
				rev=rev+str[i];
				
			}
			rev=rev+" ";
			System.out.println(rev);

	    int num=1234;
	    int revr=0;
	    while(num!=0) {
	    	
	    	revr = revr*10 + num%10;
	    	num=num/10;
	    }
	    
	    System.out.println(revr);
	 
	    String p="sarast";
	    
	    if(isPalindrome(p)) {
	    	System.out.println("String is palindrome");
	    }
	    else {
	    	System.out.println("String is not palindrome");
	    }
	
	}
	
	  public static boolean isPalindrome(String p) {
	    
	    int k=0;
	    int j = p.length()-1;
	    
	    while(k<j) {
	    	
	    	 if (p.charAt(k)!=p.charAt(j)) {
	    		   k++; 
	               j--; 
                 return false; 
               
             } 
	    	
	    }
		return true;
	    		
	}
	
}

