package collection;

import java.util.Stack;

public class QueueByTwoStack {

	
	Stack<Integer> stack1=new Stack<Integer>();
	Stack<Integer> stack2=new Stack<Integer>();
	
	public void addtoQueue(int i)
	{
		while(!stack1.empty())
		{
			stack2.push(stack1.pop());
		}
		
		stack1.push(i);
		
		while(!stack2.empty())
		{
			stack1.push(stack2.pop());
		}
	}
	public void removefromQueue()
	{
		if(stack1.empty())
		{
			System.out.println("Stack Empty");
			System.exit(1);
		}
		
		int x=stack1.pop();
		

System.out.println("Removed "+x);
	}
	
	public static void main(String args[])
	{
		QueueByTwoStack qs=new QueueByTwoStack();
		qs.addtoQueue(3);
		qs.addtoQueue(4);
		qs.removefromQueue();
		qs.removefromQueue();
		qs.removefromQueue();
		
	}
}
