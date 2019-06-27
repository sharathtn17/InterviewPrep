package newconcept;

public class JavaCon {
	
	
	public static void main(String args[])
	{
		
		String i=new String("abc");
		String j=new String("abc");
		//Integer k=Integer.valueOf(i);
		int b=j.hashCode();
		
		System.out.println(b);
		if(i==j)
		System.out.println("i==k");
		
		if(i.equals(j))
		{
			System.out.println("iequlsk");
		}
	}

}
