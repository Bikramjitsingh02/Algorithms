package javaProjectNew;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack<Item> implements Iterable<Item>{
	private Node<Item> first;
	private int n;//size of the stack 

	private static class Node<Item>{
		private Item item;
		private Node<Item> next;
	}
	
	public Stack(){
		first=null;
		n=0;
	}
	
	private boolean isEmpty(){
		return size()==0;
	}
	
	public void push(Item item){
		
		Node<Item> oldfirst;
		oldfirst=first;
		first=new Node<Item>();
		first.item=item;
		first.next=oldfirst;
		n++;
	}
	public Item pop(){
		if(isEmpty()) throw new NoSuchElementException("stack underflow");
		Item item;
		item=first.item;
		first=first.next;
		return item;
	}
	
	private int size(){
		return n;
	}
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ListMe(first);
	}
	
	public class ListMe implements Iterator<Item>{

		private Node<Item> current;
		
		ListMe(Node<Item> first){
			current=first;
		}
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current!=null;
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			Item item;
			item=current.item;
			current=current.next;
			return item;
		}
		
	}

	/*
	public static void main(String args[])
	{
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(13);
		stack.push(45);
		for(int g: stack)
		{
			System.out.println(g);
		}
	}*/
	
	

	
	
}
