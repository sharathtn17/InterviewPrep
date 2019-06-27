package testProject.test;

public class exception {

	
	public void getString()
	{
		try{
			
			A();
			System.out.println("A");
		}
		
		catch(Exception e)
		{
			System.out.println("b");
		}
		finally
		{
			System.out.println("c");
		}
		
		System.out.println("D");
	}
	
	public void A()
	{
		throw new Error();
	}
	
	public static void main(String args[])
	{
		exception e=new exception();
		e.getString();
		
	}
}
