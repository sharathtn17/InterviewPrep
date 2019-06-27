package testProject.test;

import java.util.HashSet;
import java.util.Set;

public class KeyPair {
	
	
	public static void main(String args[])
	{
		
		int array[]={1,2,3,4,6,7,8,9,10,13};
		int j=array.length-1;
		int tar=11;
		int high=array.length-1;
		int low=0;
		while(low<high)
		{
			if(tar<=array[low]+array[high])
			{
				if(tar==array[low]+array[high]) System.out.println(array[high]+" , "+array[low]);
				high--;
				
			}
			
			else if(tar>=array[low]+array[high] )
			{
				if(tar==array[low]+array[high]) System.out.println(array[low]+" , "+array[high]);
				//i++;
				low++;
			}
		}
		
		//String s=s.
		//Set s=new HashSet<>();
	//	s.
		
	}

}
