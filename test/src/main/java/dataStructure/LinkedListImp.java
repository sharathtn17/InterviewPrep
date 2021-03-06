package dataStructure;

public class LinkedListImp {
     Node head;
	
	public  void addToList(int element)
	{   
		
		if(head==null)
		{ Node newnode=new Node(element);
			//newnode.data=element;
		    head=newnode;
			newnode.next=null;
			System.out.println("Head");
		}else{
			Node temp=head;
		while(temp.next!=null)
		{   
			temp=temp.next;
		}
		Node newnode=new Node(element);
		temp.next=newnode;
		newnode.data=element;
		newnode.next=null;
	}
	}
	
	public void traverseAndPrint()
	{
		Node temp=head;
		
		if(head==null)
		{
			System.out.println("List Is EMPTY");
		}else{
			while(temp!=null)
			{
			System.out.print(temp.data+",");
			temp=temp.next;
			}
		}
		System.out.println();
	}
	
	public Node head()
	{
		return head;
	}
	
	public void delete(int element)
	{
		Node temp=head;
		Node next1=temp.next;
		Node next2=next1.next;
		
		if(temp.data==element)
		{
			head=temp.next;
		}else
		{
		while(temp.next!=null)
		{  
		if(next1.data==element)
		{
			temp.next=next2;
			next1.next=null;
			break;
		}else if(temp.next.next!=null){
		 temp=next1;
		 next1=temp.next;
		 next2=next1.next;
		}
		}
		
		}
	}
	
	public void add(int index, int ele)
	{
		int i=0;
		Node temp=head;
		Node nextnode=temp.next;
		Node temp2=nextnode.next;
		if(head==null)
		{
			System.out.println("Stack Empty");
			
		}else
		{
			if(index==0)
			{
				Node newnode=new Node(ele);
				newnode.next=head;
				head=newnode;
			}else
			{
			while(temp.next!=null)
			{   i++;
				if(i<=index)
			    {
				  
			   System.out.println(i+"i++");
		       if(i==index)
		       {   Node newnode=new Node(ele);
		    	   temp2=temp.next;
		           temp.next=newnode;
		    	   newnode.next=temp2;
		    	   break;
		       }
		       else {
		    	   temp=temp.next;
		    	// nextnode=temp.next;
		   		// temp2=nextnode.next;
		    	   
		       }
	     	} else  break;
		}
		}
		}
	}
	public Node reverse(Node node)
	{    
		 Node temp=node;
		 
		if(temp.next==null)
		{   head=temp;
			return temp;
		}
		
		Node n2=reverse(temp.next);
		n2.next=temp;
		n2=n2.next;
		return n2; //reverse(temp.next).next=temp;
	}
	
	public void removeLast()
	{
	   Node temp=head;
	   Node prev=null;
		if(head==null)
		{
			System.out.println("List Is Empty");
		}else
		{
			while(temp.next!=null)
			{
				prev=temp;
				temp=temp.next;
			}
			
			prev.next=null;
			System.out.println(temp.data+"Removed");
		}
		
	}
	

	public void remove()
	{
	   Node temp=head;
	   Node prev=null;
		if(head==null)
		{
			System.out.println("List Is Empty");
		}else
		{
			head=temp.next;
			temp.next=null;		
			System.out.println(temp.data+"Removed");
		}
		
	}
	
	
	static  class Node
	{
		int data;
		Node next;
		
		public Node(int element)
		{
		//	Node newnode=new Node(element);
			this.data=element;
			
		}
		
		
	}
	 
	 
}
