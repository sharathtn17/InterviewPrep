package Interview;

import java.util.ArrayList;

public class AddMultiplearray {
	
	
	public static void main(String args[])
	{
		int arr1[]={2,3,4,-1};
		int arr2[]={-2,5,-4,-8};
		//int arr3[]={9,3,6,0};
		int sum=0;
		
		ArrayList<Integer> al=new ArrayList<Integer>();
         for(int a:arr1)
         {
        	 al.add(a);
         }
         
			
		
		for(int i=0;i<arr2.length;i++)
	    {  // System.out.println(sum-arr2[i]+"SUMM");
			if(al.contains(sum-arr2[i]))
			{
				System.out.println("TURE"+arr2[i]);
			}else
			{
				System.out.println("FALSE");
			}
			
			
		}
		
		
		
		
	}

}
