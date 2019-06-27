package testProject.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Spliterator;

public class ArryList {

	
	public static void main(String[] args)
	{
		
		List<String> ls=new ArrayList<String>();
		ls.add("Ele1");
		ls.add("Ele2");
		
		//System.out.println(ls.get(1));
		
		Map<String,Integer> mp=new HashMap<String,Integer>();
		
		mp.put("e1", 1);
		mp.put("e2", 2);
		mp.put("e3", 3);
		
		
		LinkedList<String> sl=new LinkedList<String>();
		sl.add("sharath");
		sl.add("bharath");
		sl.add("thsd");
		sl.add("sdf");
		//int j;
		Spliterator<String> sp=sl.spliterator();
		sp.forEachRemaining((p)->{ 
			 
			System.out.println(p);
			
		});
		
		
		System.out.print(mp.get("e1"));
		System.out.print(mp.values());
		System.out.print(mp.keySet());
		
		for(String i:mp.keySet())
		{
			System.out.println(i);
		}
		//System.out.print(mp));
	}
	public static void printd(LinkedList<String> s)
	{
		System.out.println(s.peek());
		s.remove();
	}
}
