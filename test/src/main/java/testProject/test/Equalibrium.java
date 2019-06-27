package testProject.test;

public class Equalibrium {
	
	
	public static void main(String args[])
	{
		
		int arr[] = { -7, 3, 2, 5, -6, -3, 0 }; 
		int leftsum=0;
		int rightsum=0;
		for(int i=0;i<arr.length;i++)
		{
			leftsum=leftsum+arr[i];
			rightsum=0;
			for(int j=arr.length-1;j>=i;j--)
			{
				rightsum=rightsum+arr[j];
				
			}
			if(leftsum==rightsum)
			{
				System.out.println("ewaulibrium"+i);
			}
			
		}
		
		
		
		
		
	}

}
