package javaProjectNew;

import java.util.Iterator;

public class LinkedList<Item> implements Iterable<Item>{
	
	Node<Item> head;
	int n;
	
	public LinkedList() {
		head=null;
		n=0;
	}

	public boolean isEmpty(){
		return head==null;
	}
	public int size(){
		return n;
	}
	
	public void  addAtBegin(Item item){
		if(isEmpty()) {
			head=new Node<Item>();
			head.item=item;
			head.next=null;
			n++;
		}
		else
		{
		Node<Item> oldhead=head;
		head=new Node<Item>();
		head.item=item;
		head.next=oldhead;
		//oldhead.next=null;
		n++;
		}
	}
	
	
	public void addAtEnd(Item item){
		Node<Item> oldnode;
		for(Node<Item> current=head;current!=null;current=current.next)
		{
			if(current.next==null){
				
				System.out.println("this ");
				oldnode=current;
				current=new Node<Item>();
				current.item=item;
				oldnode.next=current;
				current.next=null;
			}
			
			
		}
		
	}
	
	public Item peek()
	{
		return head.item;
	}
	private static class Node<Item>{
		Item item;
		Node<Item> next;
	}
	
	

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ListIt<Item>(head);
	}
	
	public static  class ListIt<Item> implements Iterator<Item>{
		
		Node<Item> current;
		
		public ListIt(Node<Item> head)
		{
			current=head;
		}
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current!=null;
		}

		@Override
		public Item next() {
			Item item;
			item=current.item;
			current=current.next;
			// TODO Auto-generated method stub
			return item;
		}
		
		
	}
	
	public static void main(String args[]){
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.addAtBegin(12);
		list.addAtBegin(43);
		list.addAtBegin(432);
		
		list.addAtEnd(323);
		list.addAtEnd(32);
		list.addAtEnd(6);
		//System.out.println(list.peek());
		for(int i: list)
		{
			System.out.println(i);
		}
	}
	
}
