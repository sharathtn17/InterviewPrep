package testProject.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputFromUser {
	
	
	public static void main(String args[]) throws IOException
	{
		InputStreamReader reader=new InputStreamReader(System.in);
		
		BufferedReader r=new BufferedReader(reader);
		//r.readLine();
		
		System.out.println(r.readLine());
		System.out.println(r.readLine());
		
		System.out.println("Now Scanner");
		Scanner scan=new Scanner(System.in);
		System.out.println(scan.nextLine());
		
	}
	

}
