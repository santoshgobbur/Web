package Web.Web;

public class Pattern {

	public static void main(String[] args) {
		
		for(int i=0; i<=4;i++) {
			
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("New Pattern");
		
         for(int m=0; m<=4;m++) {
			
			for(int n=4;n>=m;n--) {
				System.out.print("*");
			}
			System.out.println();
		}

	} 

}
