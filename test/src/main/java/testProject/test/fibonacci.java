package testProject.test;

public class fibonacci {
	
	public static void main(String args[])
	{
		/*int num1=0;
		int num2=1;
		System.out.println(num1);
		System.out.println(num2);
		int n=5;
		int sum;
		while(n!=10)
		{
			sum=num1+num2;
			System.out.println(num1+num2);
			num1=num2;
			num2=sum;
		
			n++;
		}*/
		for(int i=0;i<5;i++)
		System.out.println(fib(i));
		fib2(6);
	}
	 
	public static  int fib(int n)
	{
		if(n==0) return 0;
			
		if(n==1) return 1;
		
		return fib(n-1)+fib(n-2);
		
		
	}
	
	static int n1=0,n2=1,n3=0; 
	public static  void fib2(int count)
	{
		if(count>0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         fib2(count-1);    
	     }    
		
		
	}
}
