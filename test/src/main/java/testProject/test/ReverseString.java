package testProject.test;

public class ReverseString {
	
	public static String reverse(String str)
	{   String rev="";
	int n=str.length()-1;
	System.out.println(n);
		
		for(int i=n;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		return rev;
	}

	public static void main(String args[])
	{
		System.out.print(reverse("abcd")+"  strin");
	}
}
