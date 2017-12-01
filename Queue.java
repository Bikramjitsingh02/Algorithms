package javaProjectNew;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Queue<Item>  implements Iterable<Item>{
	private Node<Item> first,last;
	int n;
	
	public Queue(){
		first=null;
		last=null;
		n=0;
	}
	
	
	private static class Node<Item>{
		Item item;
		Node<Item> next;
	}
	
	public boolean isEmpty()
	{
		return first==null;
	}
	
	public int size(){
		return n;
	}
	
	public void enqueue(Item item){
		Node<Item> oldlast=last;
		last=new Node<Item>();
		last.item=item;
		last.next=null;
		if(isEmpty()) first=last;
		else oldlast.next=last;
		n++;
			
		
	}
	
	public Item dequeue(){
		Item item;
		item=first.item;
		first=first.next;
		n--;
		if(isEmpty()) last=null;
		return item;
	}
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ListIterator<Item>(first);
	}
	
	private static class ListIterator<Item> implements Iterator<Item> {
        private Node<Item> current;

        public ListIterator(Node<Item> first) {
            current = first;
        }

        public boolean hasNext()  { return current != null;                     }
        public void remove()      { throw new UnsupportedOperationException();  }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next; 
            return item;
        }
    }
	
	public static void main(String args[]){
		Queue<Integer> queue=new Queue<Integer>();
		queue.enqueue(11);
		queue.enqueue(13);
		queue.enqueue(14);
		queue.enqueue(15);
		for(int w :queue)
		{
			System.out.println(w);
		}
	}

}
