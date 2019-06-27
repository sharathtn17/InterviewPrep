package Exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exceptions {
	
	public static void main(String args[])
	{
		try{
		int n=1/0;
		File f=new File("");
		FileReader file = new FileReader("C:\\test\\a.txt"); 
        BufferedReader fileInput = new BufferedReader(file);
		
		}
		catch(ArithmeticException ex){
			System.out.println("catch");
		}
		catch(IOException w)
		{
			
		}
		finally
		{
			System.out.println("finally");
		}
		System.out.println("Statement");
		
	}

}
