package testProject.test;

import java.util.Arrays;

public class ArrayUsingRecursion {
	static int  n=0;
 public static void main(String[] args) {
  int[] a = {1,2,3,4,5};
  int [] b=doubleArrayElements(a,a.length); //---> First Call
  
  for(int i=0;i<b.length;i++)
  {
	  System.out.println(b[i]);
  }

 }
 
 private static int[] doubleArrayElements(int[] a, int length) 
 {
	 
	  
	 if(length<=n)
	 {
		 return a;
	 }
	 
	 a[n]=a[n]*2;
	 n++;
	 doubleArrayElements(a,length-1);
	 return a;
 }
/* private static void doubleArrayElements(int[] a, int length) {
  if (length<=0){ //---> Breaking condition for recursion to stop
   printElements(a,0);   
   System.exit(0);
  }
  
  a[length-1] = a[length-1]*2;
  doubleArrayElements(a,length-1); //---> Subsequent Calls using recursion
 
 }

 private static void printElements(int[] a, int index) {
  if(index >=a.length){
   return;
  }
  System.out.println(a[index]);
  printElements(a,index+1);
 }
*/


	
}