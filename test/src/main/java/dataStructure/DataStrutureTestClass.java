package dataStructure;

import dataStructure.LinkedListImp.Node;

public class DataStrutureTestClass {

	
	public static void main(String args[])
	{
		/*//LinkedList.Node ll=new LinkedList.Node();
		LinkedListImp ll=new LinkedListImp();
		ll.addToList(2);
		ll.addToList(3);
		ll.addToList(6);
		ll.addToList(7);
		
		ll.traverseAndPrint();
		ll.remove();
		ll.traverseAndPrint();
		ll.addToList(20);
		ll.traverseAndPrint();
		
		Node n=ll.reverse(ll.head);
		n.next=null;
		
		ll.traverseAndPrint();
		
		ll.add(4, 2222);
		ll.traverseAndPrint();
		ll.delete(3);
		ll.traverseAndPrint();*/
		
		ImplementTree tree=new ImplementTree();
		dataStructure.ImplementTree.Node root=null;
		root=tree.add(root, 6);
		tree.add(root, 3);
		tree.add(root, 4);
		tree.add(root, 5);
		tree.add(root, 8);
		tree.add(root, 10);
		tree.add(root, 12);
	//	tree.add(root, 7);
		tree.traverse(root);
		tree.hightofElement(root, 12, 0);
		
		
		
		//System.out.println(root.key);
		
		
		
	}
}
