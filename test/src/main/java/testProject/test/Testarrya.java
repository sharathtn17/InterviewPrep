/*package testProject.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Testarrya {

	
	public static void main(String args[])
	{
		int arr[]={3,4,5,2,7,9,8,1};
		List<Integer> list=new ArrayList<Integer>();
		
		
		for(int a:arr)
		{
			list.add(a);
		}
		
		Collections.sort(list);
	//Integer[] arr2 =(Integer[]) list.toArray();
		int[] arr2=new int[list.size()];
		 Iterator<Integer> iterator = list.iterator();
		 for (int i = 0; i < arr2.length; i++)
		    {
			    arr2[i] = iterator.next().intValue();
		        System.out.print(arr2[i]);
		    }
		 System.out.println();
		  // int j=2;
		   int n=arr2.length;
		
		for(int i=1,j=n-1;i<arr2.length;i=i+2)
		{
			//if(j<arr2.length)
			//{
				int temp=arr2[i];
				arr2[i]=arr2[j];
				arr2[j]=temp;
				j=j+2;
			//}
		}
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]);
		}
		
		
	}
}
*/