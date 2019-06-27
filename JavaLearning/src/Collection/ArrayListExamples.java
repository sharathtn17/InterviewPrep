package Collection;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayListExamples {
	
	public static void main(String args[])
	{
		
		ArrayList<String> lists=new ArrayList<String>();
		ArrayList<String> lists3=lists;
		lists.ensureCapacity(40);//to pre declare capacity on an array
		
		lists.add("str4");
		lists.add("ntr7");
		lists.add("ktr9");
		lists.add("itr");
		lists.add("otr");
		
ArrayList<String> lists2=new ArrayList<String>();
		
		lists.add("atr10");
		lists.add("bt");


		
		
		String s=new String();
		System.out.println(s=lists.get(1));//getMethod
		
		//int[] s1="sf sfsf sfsdf ds".split(" ");
	
		lists.addAll(lists2); //Add all -can add collection elements
		
		System.out.println(lists.contains("str4")); //contains
		
		System.out.println(lists.equals(lists3));//compare an object is equal
		
		lists.forEach(n->System.out.print(n));//
		
		lists.spliterator();
		
		lists.removeIf(rm->(rm=="str4"));//lamda expressions
		
		lists.forEach((n)->System.out.println(n+" "));//lamda expressions
		
		ArrayList<Integer> ai=new ArrayList<Integer>();
		
		System.out.println(lists.stream().map(n->n+"stream ").collect(Collectors.toList()));
	 
		lists.stream().forEach(n->System.out.println(n));//
		List<String> lmb1 = lists.stream().filter(n->n.contains("str")).collect(Collectors.toList());
		
	//	Integer.parseInt(s);
		File f=new File("");
	//	FileInputStream f1=new FileInputStream(f);
	    lmb1.forEach(n->System.out.println(n+"lmb1"));
	    
	    lists.sort((sw,sr)->sw.compareTo(sr));
	    lists.forEach(n->System.out.println(n+"sort"));
	    
	}

}
