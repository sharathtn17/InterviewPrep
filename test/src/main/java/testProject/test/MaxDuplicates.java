package testProject.test;

public class MaxDuplicates {
	
	
	public static void main(String args[])
	{
		int[] arr={1,2,3,4,4,5,1,5,5,1};
		
		int i=0;
		int j=arr.length-1;
		int count=0;
		int maxCount=0;
		int maxEle = 0;
		
		while(i<j)
		{
			if(arr[j]!=999){
			if(arr[i]==arr[j])
			{
				arr[j]=999;
				count++;
				
			}
			}
			j--;
			if(i+1==j)
			{
				if(count>maxCount)
				{
					maxCount=count;
					maxEle=arr[i];
				}
				j=arr.length-1;
				count=0;
				i++;
			}
			
			
			
		}
		
		System.out.println(maxEle);
		System.out.println(maxCount);
		
		
	}

}
