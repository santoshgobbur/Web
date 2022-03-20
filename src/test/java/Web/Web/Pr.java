package Web.Web;

public class Pr {

	public static void main(String[] args) {
		
		 
		 System.out.println(Pr.isPalindrome("saras"));
		 
		// Reverse string
		
		String str = "Java";
		char[] ch = str.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--)
		{
			
			rev = rev + ch[i];
		}
		System.out.println("Reverse string " +rev);
		
		// Reverse each word in string
		
		String st = "My name is java";
		String[] w = st.split(" ");
		String revword=" ";
		
		for(int k=0;k<w.length;k++) {
			
			String word = w[k];
			String ww = "";
			
			for(int g=word.length()-1;g>=0;g--) {
				
				ww = ww + word.charAt(g);
				
			}
			
			revword = revword + ww + " ";
		}	
      
		System.out.println("Reverse each word in string " +revword);
		
		// Reverse string with each word reverse
		
		String[] word = revword.split(" ");
		
		String ss="";
		
		for(int n=word.length-1;n>=0;n--) {
			
			ss = ss + word[n] + " ";
		}
	    
		System.out.println(" Reverse string with each word reverse " +ss);
		
	}
          


   static boolean isPalindrome(String s) {
	  
	  
	  int y =0;
	  int z = s.length()-1;
	  
	  while(y<z) {
		  
		  if(s.charAt(y)!=s.charAt(z)) {
			  
			  return false;
		  }
		  
		  y++;
		  z--;
		  
	  }
	
	  return true;
	  
  }

}

