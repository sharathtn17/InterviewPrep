package testProject.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class palindrome {

	public HashMap<Character,Integer> calFreq(String input)
	{
		HashMap<Character,Integer> Storechatocc=new HashMap<Character,Integer>();
		char[] strArry=input.toCharArray();
				
		for(char ch:strArry)
		{
			/*if(Storechatocc.containsKey(ch))
			{
				Storechatocc.put(ch, Storechatocc.get(ch)+1);
			}
			else
			{
				Storechatocc.put(ch, 1);
			}*/
			Storechatocc.compute(ch, (key,valu)->(valu==null)?1 :valu+1);
		}
		
		ArrayList<Integer> i=new ArrayList<Integer>();
		i.add(1);
		i.forEach(x->System.out.print(x+" sd"));
		System.out.println(Storechatocc);
		return Storechatocc;
	}
	
	
	public static void main(String[]  args)
	{  String input="gogoggrrrrrw";
	
	   HashMap<Character,Integer> freqMap=new HashMap<Character,Integer>();
	//   Map.Entry<K, V>=freqMap.entrySet();
	   
	   palindrome p1=new palindrome();
	   freqMap=p1.calFreq(input);
	   int oddcount=0;
	   //count the number of odd
	   for(Character key :freqMap.keySet())
	   {
		   
		   if(freqMap.get(key) % 2!=0)
		   {
			   oddcount++;
		   }
	   }
	   if(oddcount>1){
		   System.out.println(  "Not Palindrome");
	   }else  System.out.println(  " Palindrome");
	  
	}
	
	
		
}
