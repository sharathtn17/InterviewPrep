package Profram;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ini=3;
		int sum = 0;
		int lst=1000;
		int i;
		int count=2;
		while(count<=1000)
		{
			boolean flag=false;
			for( i=2;i<ini;i++)
			{
				if(ini % i==0)
				{
					flag=true;
					break;
				}
				
			}
				if(flag==false)
				{
					sum=sum+i;
					count++;
					System.out.println(ini+" Prime Number"+sum);
				}
			
			
			ini++;
		}

	}

}
