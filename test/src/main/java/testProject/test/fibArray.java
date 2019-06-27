package testProject.test;

public class fibArray {
	
	
	public static void main(String args[])
	{
		int[] arr={1,3,2,1,4,2,67,54,32,6,774,32,2,244,76};
		int count=arr.length;
		int mincount=arr.length;
		int counter=2;
		int temp=1;
		int sum=0;
		int temp2=1;
		for (int i=0;i<count;i++)
		{
			
			sum=temp+temp2;
			temp2=temp;
			temp=sum;
			
			for(int j=counter;j<sum;j++)
			{   
				if(mincount>sum)
				System.out.print(arr[j]+" ");
			
				count++;
				counter++;
				mincount--;
			}
			System.out.println();
			
			
			
			
		}
		
		
	}

}
