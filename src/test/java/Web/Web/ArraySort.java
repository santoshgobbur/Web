package Web.Web;

public class ArraySort {

	public static void main(String[] args) {
		
		int[] a = {12,24,10,9,42,56};
		
		System.out.println("Before Sort");
		
        for(int g=0;g<a.length;g++) {
        	
        	System.out.println(a[g]);
        }
		
		int t;
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					
					t = a[i];
					a[i]=a[j];
					a[j]=t;
					
				}
			}
		}
        System.out.println("Elements in ascending order");
		for(int k=0;k<a.length;k++) {
			
			System.out.println(a[k]);
		}
	    
	    for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]<a[j]) {
					
					t = a[i];
					a[i]=a[j];
					a[j]=t;
					
				}
			}
		}
        
	    System.out.println("Elements in descending order");
		for(int k=0;k<a.length;k++) {
			
			System.out.println(a[k]);
		}
	
	
	}	
	

}
