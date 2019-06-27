package testProject.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class TestCar {

	public static void main(String args[]){
	      /*String Str = new String("Welcome to Tutorialspoint.com");

	      System.out.print("Return Value :" );
	      System.out.println(Str.startsWith("Welcome") );
	      System.out.println(Str.matches("Welcome") );

	      System.out.print("Return Value :" );
	      System.out.println(Str.startsWith("*Tutorials") );

	      System.out.print("Return Value :" );
	      System.out.println(Str.startsWith("Tutorials", 11) );
	      
	      String str1="sdfsdf fdsfs fsd fdssdf";
	      ArrayList<Character> al=new  ArrayList<Character>();
	     // List<String[]> al1=  al.stream().map(x->x.split(" ")).collect(Collectors.toList());
	     // s
	      System.out.println(al);*/
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(3);
		//al.add(4);
		al.add(5);
		
		Set<Integer> s=new HashSet<Integer>();
		
		s.add(1);
		s.add(3);
		//s.add(5);
		System.out.println(s.retainAll(al));
		System.out.println(s);
		
		System.out.println(al.retainAll(s));
		System.out.println(al);
		
		//Map<Integer> hm = new HashMap<Integer>();
		Map<Integer,Integer>  hm=new HashMap<Integer,Integer>();
		hm.put(1, 10);
		hm.put(2, 11);
		hm.put(3, 13);
		
		System.out.println(hm);
		hm.replace(2, 11, 14);
		System.out.println(hm);
		System.out.println(hm.values());
		System.out.println(hm.keySet());
		
		
		Stack stc =new Stack();
		/*stc.push();
		stc.peek()*/
	   }
	 
	 
	
	
}
