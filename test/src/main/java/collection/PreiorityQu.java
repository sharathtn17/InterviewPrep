package collection;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class PreiorityQu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	 PriorityQueue<StringBuffer> pQueue = 
                 new PriorityQueue<StringBuffer>(); 

// Adding items to the pQueue using add() 
pQueue.add(new StringBuffer("abc")); 
pQueue.add(new StringBuffer("j")); 
pQueue.add(new StringBuffer("lkd")); 
 
System.out.println(pQueue);*/

   Set<StringBuffer> set1=new HashSet<StringBuffer>();
   set1.add(new StringBuffer("d"));
   System.out.println(set1);
   ArrayDeque<StringBuffer>  d=new ArrayDeque<StringBuffer>();
   d.add(new StringBuffer("d"));
   System.out.println(d);
   
	}

}
