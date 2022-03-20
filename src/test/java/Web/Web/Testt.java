package Web.Web;

public class Testt {

	public static void main(String[] args) {
	
		try {
			String s="1234";
			s=null;
			System.out.println(s);
			System.out.println(s.toString());
		}
		catch(NullPointerException e) {
			
			e.getStackTrace();
		}
		
	}

}
