package Web.Web;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str = "Hello world selenium java";
		
	    System.out.println(str.charAt(4));
	    
	    System.out.println(str.substring(5,8));
	    
	    System.out.println(str.substring(2));
	    
	    
	    String s1 = "Java";
	    String s2 = "Java";
	    System.out.println(s1==s2);
	    
	    String s3 = new String("Java");
	    System.out.println(s3.equals(s1));
	    System.out.println(s3==s1);
	    
	    //String s1 = s1.concat("Javatpoint");
	    
	    System.out.println(s1.equals(s1.concat("tpoint")));
	    
	    
	    
	    
	

	}

}
