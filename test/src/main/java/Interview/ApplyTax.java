package Interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.TreeSet;

public class ApplyTax {

	
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		 // String one = args[0].; //=="one"
		//  String two = args[1]; 
	// 	System.out.println(one+two);
		String a="abcfsdsdfssfs ";
		
		
		 TreeSet<StringBuilder> ts = new TreeSet<StringBuilder>(); 
		  
	        // Elements are added using add() method 
	        ts.add(new StringBuilder("A")); 
	        
	        
		System.out.println(a.join("*",a.split("fs")));
		System.out.println(a.join("*",a.split("fs")));
		//PriorityQueue
		//LinkedList
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		double input;
		for(int i=3;i<7;i++)
		{
			
			
		input=Integer.parseInt(in.readLine());
		System.out.println(input);
		if(i%2==0)
		{
		  input=0.18*input+input;
		  System.out.println(input);
		}else
		{
			  input=0.12*input+input;
			  System.out.println(input);
		}
		
		}
		
	}
}
