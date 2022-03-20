package Web.Web;

public class Remove {

	public static void main(String[] args) {
		
		// Remove Special chars in string
		
		String s = "&#$@$#& sdfsdf";
				
	    s = s.replaceAll("[^a-zA-Z0-9]", "");
		
	    System.out.println(s);
	    
	    //
	}

}
