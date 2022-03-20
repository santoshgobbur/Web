package Web.Web;

public class Stringdemo {

	//private static final int MAX_CHAR = 0;

	public static void main(String[] args) {
		
		Stringdemo.reverseWord("Hello Java");
	
	}
	public static void reverseWord(String s) {
		
		String[] words = s.split(" ");
		String revString = "";
		
		for(int j=0;j< words.length; j++) {
			 
		    String words1 = words[j]; 
	        String reverseWord = "";
	        
		for(int i= words1.length()-1; i>=0; i--) {
			
			reverseWord = reverseWord + words1.charAt(i);
		
		}
		
		revString  = revString  + reverseWord + " ";
	}
      System.out.println(s);
      System.out.println(revString);
	
 }
  	
}
