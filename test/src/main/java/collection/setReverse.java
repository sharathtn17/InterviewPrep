package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class setReverse {
	
	
	public static void main(String args[])
	{
		Set<Integer> s=new HashSet<Integer>();
		s.add(1);
		s.add(6);
		s.add(3);
		s.add(9);
		s.add(2);
		s.add(0);
		System.out.println(s);
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.addAll(s);
		
		TreeSet<Integer> teeset=new TreeSet<Integer>(s);
		
		teeset.descendingIterator();
		teeset.
		System.out.println(al.size()+"ArraySIZE");
		System.out.println(s.size()+"SETSIZE");
		
		for(int i=al.size()-1;i>=0;i--)
		{
			System.out.print(al.get(i));
		}
		
		TreeSet<Integer> tset=new TreeSet<Integer>();
		tset.addAll(s);
		Iterator it=tset.descendingIterator();
		while(it.hasNext())
		{
			
			System.out.println(it.next());
		}
		
		
		System.out.println(tset.descendingSet());
	}

}
