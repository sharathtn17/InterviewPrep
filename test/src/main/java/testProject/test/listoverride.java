package testProject.test;

import java.util.ArrayList;

public class listoverride {
	
	
	public static void main(String args[])
	{
		
		ArrayList<String> list = new ArrayList<String>()
		{
		    private static final long serialVersionUID = 1L;

		    @Override public String toString()
		    {
		        return "abc";
		    }
		};
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		System.out.println(list);
		
		
	}
	

}
