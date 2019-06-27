package testProject.test;

public class palindromeloop {

	
	
	public static void main(String args[])
	{
		String palin="racecar";
		
		char[] chararry=palin.toCharArray();
		
		int lowIndex=0;
		int highIndex=palin.length()-1;
		boolean flag=true;
		while(lowIndex<highIndex)
		{
			
			if(chararry[lowIndex]==chararry[highIndex])
			{
				lowIndex++;
				highIndex--;
			}
			else{
				flag=false;
				break;
			}
			
		}
		if(flag)
		System.out.println("palindrome");
		else System.out.println("Not Palindrome");
	}
}
