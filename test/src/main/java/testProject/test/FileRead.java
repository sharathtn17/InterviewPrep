package testProject.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileRead {
	
	
	public static void main(String args[]) throws IOException
	{
		
		FileReader file=new FileReader("C:\\Users\\sn0000\\Desktop\\ListOfSoftwares.txt");
     	//	System.out.println((char)file.read());
		
		BufferedReader br = new BufferedReader(file);
		String st;
		while((st=br.readLine())!=null)
		System.out.println(st);
				
		String data=new String(Files.readAllBytes(Paths.get("C:\\Users\\sn0000\\Desktop\\ListOfSoftwares.txt")));
		System.out.println(data);
}
	
}
