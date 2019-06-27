package testProject.test;

public class MyStack {
	   private int maxSize;
	   private long[] stackArray;
	   private int top;
	   
	   public MyStack(int s) {
	      maxSize = s;
	      stackArray = new long[maxSize];
	      top = -1;
	   }
	   public void push(long j) {
		  if(!isFull())
		  {
	      stackArray[++top] = j;
	      System.out.println(j +" Pushed to Stack");
		  }else
			  System.out.println("Stack is Full ");
		  
	   }
	   public long pop() {
	      return stackArray[top--];
	   }
	   public long peek() {
	      return stackArray[top];
	   }
	   public boolean isEmpty() {
	      return (top == -1);
	   }
	   public boolean isFull() {
	      return (top == maxSize - 1);
	   }
	   public static void main(String[] args) {
	      MyStack theStack = new MyStack(3); 
	      theStack.push(10);
	      theStack.push(20);
	      theStack.push(30);
	      theStack.push(40);
	      theStack.push(50);
	      long b= theStack.pop();
		     System.out.println(b);
	      
	      while (!theStack.isEmpty()) {
	         long value = theStack.pop();
	         System.out.print(value);
	         System.out.print(" ");
	      }
	      System.out.println("");
	     
	   }
	}