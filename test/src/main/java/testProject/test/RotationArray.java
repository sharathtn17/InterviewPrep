package testProject.test;

public class RotationArray {
	
	
	public static void main(String args[])
	{
		
		int arr[]={1,2,3}; 
		//boolean IsClockWise=true;
	//	int rotation=1;
		 int count=1;
		 
/*		for(int j=0;j<count;j++)
		{
		 int temp=arr[arr.length-1];
		
		for(int i=arr.length-1;i>0;i--)
		{
					
			
			arr[i]=arr[i-1];
			
			
		}
		 arr[0]=temp;
		}
		*/
		 
		 int j,temp = 0;
	        for(int i=0;i<count;i++)
	        {   temp=arr[0];
	        System.out.println(temp);
	            for( j=0;j<arr.length-1;j++)
	            {    
	                arr[j]=arr[j+1];
	            }
	            arr[arr.length-1]=temp;
	        }
	        
	        
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		
	}

}
