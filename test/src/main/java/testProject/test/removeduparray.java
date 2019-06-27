package testProject.test;

import java.util.HashSet;
import java.util.Set;

public class removeduparray {

	
	public static void rdup(int arr[])
	{
     //**  	 
         
		int end = arr.length;

	    for (int i = 0; i < end; i++) 
	     {
	        for (int j = i + 1; j < end; j++)
	         {
	            if (arr[i] == arr[j])
	            {                  
	                int shiftLeft = j;
	                for (int k = j+1; k < end; k++, shiftLeft++)
	                {
	                    arr[shiftLeft] = arr[k];
	                }
	                end--;
	                j--;
	            }
	        }
	    }

	   
	    for(int i = 0; i < end; i++){
	       System.out.print(arr[i]+",");
	    }
	    
     }
  
 
		


		
		
		
	
	
	public static void main(String args[])
	{
		int[] arr={2,3,6,6,3,6,4,3};
		
		rdup(arr);
		
	
}
}