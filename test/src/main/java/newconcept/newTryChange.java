package newconcept;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class newTryChange {

	public static void main(String args[]) throws FileNotFoundException, IOException{
	String s;
	// String readFirstLineFromFileWithFinallyBlock(String s1)
   //         throws IOException {
//BufferedReader br = new BufferedReader(new FileReader(path));
try(BufferedReader br =
new BufferedReader(new FileReader(""))) {
	System.out.println("inside try");
//return br.readLine();
} 
}
//}
}