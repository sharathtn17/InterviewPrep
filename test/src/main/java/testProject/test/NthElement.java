package testProject.test;

import java.util.TreeSet;

public class NthElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int arr[]={3,2,1,4,5,0};
		
		TreeSet<Integer> set=new TreeSet<Integer>();
		for(int i:arr)
		set.add(i);
		int ele=0;
		for(int i=0;i<=1;i++)
		{
			ele=set.pollFirst();
		}
		System.out.println(ele);
	}

}
