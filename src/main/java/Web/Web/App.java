package Web.Web;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class App 
{
	
    public static void main( String[] args )
    {
    
    	System.out.println("Hi Java");
    	App ap = new App();
    	ap.reverseString();
    	ap.duplicateWord();
    	ap.palindrome("saras");
    	
    }
   
   public void reverseString() {
	   
	   String w = "My java";
	   String a[] = w.split(" ");
	
	   String revw= "";
	   for(int i=a.length-1;i>=0;i--) {
	
		   revw = revw+a[i]+" ";
		   
	   }
	   System.out.println("Revesrse string " +revw);
	   String reveach="";
	   
	   for(String s:a) {
		   
		   String rw=""; 
		   for(int j=s.length()-1;j>=0;j--) {
			   
			   rw =rw+s.charAt(j);
			   
		   } 
		   reveach = reveach+rw+" ";  
	   }
	   
	   System.out.println("Reverse each word in string " +reveach);
	   
   }
   
   public void duplicateWord() {
	   
	   String d = "My name name";
	   String q[] = d.split(" ");
	   HashMap<String,Integer> h = new HashMap<String,Integer>();
	   Set<String> s1 = new HashSet<String>();
	   Set<String> s2 = new HashSet<String>();
	 
	   for(String f:q) { 
		   		
		   if(h.containsKey(f)) {
			   h.put(f, h.get(f)+1);
			   
		   }
		   else {
			   h.put(f, 1);
		   }
	   }
	   System.out.println("Count of words in string->" +h);
	  
	   for(String m:q) {
		   
		   if(!s1.contains(m)){
			   s1.add(m);
		   }
		   else {
			   s2.add(m);
			   
		   }
	   }
	   System.out.println(s1);
	   System.out.println("Duplicate word " +s2);
	   
	   String a[] = {"hi","hello","hi"};
	   char ch[] = d.toCharArray();
	   HashMap<String,Integer> hh = new HashMap<String,Integer>();
	   HashMap<Character,Integer> chh = new HashMap<Character,Integer>(); 
	   
	   for(String ff:a) { 
	   		
		   if(hh.containsKey(ff)) {
			   hh.put(ff, hh.get(ff)+1);
			   
		   }
		   else {
			   hh.put(ff, 1);
		   }
	   }
	   System.out.println("Count of words in string array -> " +hh);
	   
	   for(char chs:ch) { 
	   		
		   if(chh.containsKey(chs)) {
			   chh.put(chs, chh.get(chs)+1);
			   
		   }
		   else {
			   chh.put(chs, 1);
		   }
	   }
	   
	   System.out.println("Count of chars in string -> " +chh);
	}
      
   public void palindrome(String str) {
	   
	   String[] pl = str.split("");
	   
	   for(int p=0;p<=pl.length;p++) {
		   
		   for(int l=pl.length-1;l>=0;l--){
			   
			   if(pl[p]==pl[l]){
				  
				   p++;
				   l--;
				    
			   }
			   else {
				   System.out.println("String is not palindrome");
			   }
		   }
		   System.out.println("palindrome");
	   }
	   
   }
   
   public void anagram(String st) {
	   
   }
   
}
