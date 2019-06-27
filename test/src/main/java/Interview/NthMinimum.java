package Interview;

public class NthMinimum {
	static // 3 2 1 4 5 8 7 10
	
	int a;
	public static void main(String args[])
	{ 
		int arr[]={1000,2,3,800,5,700,100,9,400,6}; //1,2,3,4,5,6,7,8
		
		nthelem(arr,0,arr.length-1,3);
		
		System.out.println(arr[2]);
		
	}
	public static void nthelem(int arr[],int low,int highm,int m)
	{
		if(low<highm){
		//int mn=m;
		a=partition(arr,low,highm);
		System.out.println("UUUSSSSUSUSUSUSUSUS****"+a);
		
		if(a<m){
			System.out.println("@@@@@@@@ "+a);
			nthelem(arr,a+1,highm,m);}
		else
			nthelem(arr,low,a-1,m);
		
		
		}
		// a;
}

	public static int partition(int arr[],int low,int high)
	{
		
		
	    //int low=0;
	   // int high=arr.length-1;
		int min=arr[high];
		System.out.println(min);
		int i=low-1;
		
		for(int j=low;j<=high-1;j++)
		{		
		
			if(arr[j]<=min)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		
		
	
	}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		
		
		
		return i+1;
	}
	
}