package testProject.test;

public class SelectionSort {

	
	public int[] SelectionSort(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			int min_inx=i;
			
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min_inx])
					min_inx=j;
			}
			
			int temp=arr[i];
			arr[i]=arr[min_inx];
			arr[min_inx]=temp;
			
			
			
		}
		
		
		return arr;
	}
	
	public static void main(String args[])
	{
		int a[]={4,3,5,7,2,1,10};
		
		a=new SelectionSort().SelectionSort(a);
		
		for(int b:a)
		{
			System.out.print(b+" ");
		}
		
	}
}
