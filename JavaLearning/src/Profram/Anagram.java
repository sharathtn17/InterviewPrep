package Profram;

import java.util.ArrayList;
import java.util.Collections;

public class Anagram {
	
	
	public static void main(String args[])
	{
		
		String s="SiLeNt CAT";
		boolean flag=true;
		String s2="LisTen AcT";
		
		String copyofs1=s.replaceAll("//s", "").toLowerCase();
		String copyofs2=s2.replaceAll("//s", "").toLowerCase();
		
		ArrayList<Character> sl1=new ArrayList<Character>();
		ArrayList<Character> sl2=new ArrayList<Character>();
		
		for(Character c:copyofs1.toCharArray())
		{
			sl1.add(c);
		}
		for(Character c:copyofs2.toCharArray())
		{
			sl2.add(c);
		}
		
		Collections.sort(sl1);	
		Collections.sort(sl2);	
		
       for(int i=0;i<sl1.size();i++)
       {
    	   if(sl1.get(i).equals(sl1.get(i)))
    	   {
    		    flag=true;
    	   }
    	   else
    	   {
    		   flag=false;
    	   }
       }

       if(flag)
       {
    	   System.out.println("Tuewwwww");
       }
	}

	
}
