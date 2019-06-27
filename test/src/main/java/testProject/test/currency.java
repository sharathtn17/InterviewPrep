package testProject.test;

public class currency {
	
	
	
	
	public static void main(String args[])
	{
		double payment=121212;
		
		
		int hundredth=(int) (payment%1000);
		//System.out.println(hundredth);
		int rem=(int) (payment/1000);
		//System.out.println(rem);
		int i=0;
		int arr[] =new int[10];
		while(rem!=0)
		{
			arr[i]=rem%100;
			rem=rem/100;
			System.out.println(rem);
			System.out.println(arr[i]);
			i++;
			if(rem==0)break;
		}
		System.out.println(arr.length);
			String format = "";	
         for(int i1=arr.length-1;i1>=0;i1--)
         {
        	 if(arr[i1]!=0)
        	 format+=String.valueOf(arr[i1])+",";
         }
        System.out.println(format);
           format=format+String.valueOf(hundredth);
           
           System.out.println("US"+"$ "+format);
	}

	  
}