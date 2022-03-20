package Web.Web;

public class Numbers {

	public static void main(String[] args) {
        
		// Reverse the number
		int num = 54321;
		int rev = 0;
		
		while(num!=0) {
			
			rev = rev*10 + num%10;
			num = num/10;
		}
      
		System.out.println("Reverse integer is " +rev);
		
		// Largest & smallest number in array
		
		int numb[] = {12,24,42,10,34,33};
		
		int smallest = numb[0];
		int largest = numb[0];
		
		for(int i=1; i<numb.length; i++)
		{
			if(numb[i]>largest) {
				
				largest = numb[i];
			}
			else if(numb[i]<smallest) {
				smallest = numb[i];
			}
		
		}
		
		System.out.println(" Largest number is " +largest);
		System.out.println(" smallest number is " +smallest);
		
	}

}
