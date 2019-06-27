package testProject.test;

public class SumOfDigitUsingRecurssion {
	
	int result=0;
	
	public  int sumOfDig(int n)
	{   if(n==0)
	  {
		return result;
	    }else{
		result=result+(n%10);
	    sumOfDig(n/10);
	}
	return result;
	}
		
	
	
	public static void main(String[] args)
	{   int n =234;
	SumOfDigitUsingRecurssion s=new SumOfDigitUsingRecurssion();
		System.out.println(s.sumOfDig(3456));
		
	}

}
