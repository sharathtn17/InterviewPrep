package newconcept;

public class wrapperclass {
	
	
	// Java program to demonstrate that prmitive
	// wrapper classes are immutable
	 public String s;
	    public static void main(String[] args)
	    {
	        Integer i = new Integer(12);
	     /* 
	        System.out.println(i);
	        System.out.println(s);
	        modify(i,s);
	        System.out.println(i);
	        System.out.println(s);*/
	       // All primitive wrapper classes (Integer, Byte, Long, Float, Double, Character, Boolean and Short) are immutable in Java, 
	       //so operations like addition and subtraction create a new object and not modify the old.
	    }
	 
	    private static void modify(Integer i,String s)
	    {
	        i = i + 1;
	        s="ddd";
	        System.out.println(i);
	        System.out.println(s);
	    }
	    
	

}
