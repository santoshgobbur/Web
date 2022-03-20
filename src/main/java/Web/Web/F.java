package Web.Web;
import org.testng.annotations.Test;

public class F {

	
	public static void main(String[] args) {
	
		F f = new F();
		G g = new G();
		F h = new G();
	
		f.m();
		g.m();
		h.m();
		
	    Integer a=100;
	    Integer b=100;
	    
	    if(a==b) {
	    System.out.println(a==b);
	    System.out.println(a!=b);
	    }

	    
	    
	
		
	}
	
	public static void m() {
		
		System.out.println(" F class method");
	}
	
}

class G extends F {
	
public static void m() {
		
		System.out.println(" G class method");
}
	
	
}
