package testProject.test;

public class ReverseStringRecurrsion {

	String revStr="";
	
	public String reverse(String str)
	{
		if(str.length()==0)
		{
			return revStr;
		}
		else
		{
			revStr=revStr+str.charAt(str.length()-1)+reverse(str.substring(0,str.length()-1));
		}
		return revStr;
	}
	public static void main(String args[])
	{
		
		ReverseStringRecurrsion rsr=new ReverseStringRecurrsion();
		System.out.print(rsr.reverse("thred"));
	}
	
	
}
