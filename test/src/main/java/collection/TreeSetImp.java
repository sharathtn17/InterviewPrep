package collection;

import java.util.TreeSet;

public class TreeSetImp {

	
	public static void main(String args[])
	{
		TreeSet<Integer> t = new TreeSet<Integer>();
		
		t.add(2);
		t.add(3);
		t.add(5);
		t.add(8);
		t.add(4);
		t.add(1);
		System.out.println(t);
		System.out.println(t.first());
		System.out.println(t.headSet(3)+" - headSet() Return less than given element ie3");
		System.out.println(t.tailSet(4)+" -  tailSet() Return greater than given element ie4");
		System.out.println(t.last()+" last() Return  last element -Greater element ie 8");
		System.out.println(t.first()+" first() Return first element -Lesser element ie 1");
		//System.out.println(t.ceiling(4));
		System.out.println(t.lower(3));
		System.out.println(t.higher(3));
		System.out.println(t.descendingSet()+" - Iterator");
		System.out.println(t.iterator().next()+" - descending() Iterator");
		System.out.println(t.descendingIterator().next()+" - descendingSet() ReverseOrder");
		
		
		String a="abc";
		String b=new String("abc");
		String c=a+b;
		System.out.println(c);
		System.out.println(a.concat(b));
		
	    
		
		
		
		
		
		
	}
}
