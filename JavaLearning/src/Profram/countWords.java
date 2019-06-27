package Profram;

import java.util.ArrayList;
import java.util.HashMap;

import org.omg.Messaging.SyncScopeHelper;

public class countWords {
	
	
	public static void main(String s[])
	
	{
		String w1="hello java program program program";
		String w2="program program";
		
		HashMap<String, Integer> mp=new HashMap<String, Integer>();
		
		
		String[] str2=w1.split(" ");
		
		
		for(String i:str2)
		{
			
			if(mp.containsKey(i))
			{
				mp.put(i, mp.get(i)+1);
			}else
				mp.put(i, 1);
		}
		
		
		String[] str1=w1.split(" ");
		
		for(String i:str1)
		{
			if(mp.containsKey(i))
			{
				System.out.println(i+" "+mp.get(i));
			}
		}
		
	//	System.out.println(mp.entrySet());
	}

		
		/*ArrayList a1 = null,a2 = null;
		a1.add(str1.split(" "));
		a2.add(str2.split(" "));
		
		for(int i=0;i<str2.length();i++)
		{
			if()
		}*/
	

	
	
}

