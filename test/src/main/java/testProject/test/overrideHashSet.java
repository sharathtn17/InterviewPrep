package testProject.test;

import java.util.ArrayList;
import java.util.HashSet;

public class overrideHashSet {
	
	
	@Override public int hashCode() { return 1;}
    @Override public String toString() { return "100"; }
    @Override public boolean equals(Object o) { return this.equals(o); }

    
   public static void main(String args[])
   {
	   
	   ArrayList<String> h=new ArrayList<String>(){
		   
		   @Override public String toString()
		    {
		        return get(1);
		    }
	   };
	   
	   
	   h.add("sd");
	   h.add("ee");
	   h.add("rr");
	   h.add("tt");
	   
	  System.out.println(h);
	  
	  String someString = "Lala";
	  
	  someString = "asdf";
	 
      final String s1="a";
      final   String s2="b";
       String s3="ab";
       System.out.println(s1+s2==s3);
	 // final String someString = "Lala";
	   
	   
   }
}
