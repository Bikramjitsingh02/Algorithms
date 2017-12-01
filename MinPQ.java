package javaProjectNew;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MinPQ<Key> implements Iterable<Key> {

	
	private Key[] pq;
	private int n;
	private Comparator<Key> comparator;
	
	
	public MinPQ(int maxcapacity){
		pq=(Key[]) new Object[maxcapacity+1];
		n=0;
	}
	
	
	public MinPQ(){
		this(1);
	}
	
	public boolean isEmpty(){
		return n==0;
	}
	
	public int size(){
		return n;
	}
	
	public Key min(){
		if(isEmpty()) throw new NoSuchElementException();
		return pq[1];
	}
	
	public void insetKey(Key x){
		pq[++n]=x;
		swim(n);
		
	}
	
	public void swim(int k){
		while(k>1 && greater(k/2, k)){
			exch(k,k/2);
			k=k/2;
		}
	}
	
	public boolean greater(int i,int j){
		if(comparator==null){
			return ((Comparable<Key>) pq[i]).compareTo(pq[j])>0;
		}
		else{
			return comparator.compare(pq[i], pq[j])>0;
		}
		
	}
	public void sink(int k){
		while(2*k<n){
			int j=2*k;
			if(j<n && greater(j,j+1)) j++;
			if(!less(j,k)) break;
			exch(k,j);
			k=j;
		}
	}
	public boolean less(int j,int k){
		
		if(comparator==null)
		{
			return ((Comparable<Key>) pq[j]).compareTo(pq[k])<0;
		}
		else 
		{
			return comparator.compare(pq[j], pq[k])<0;
		}
	}
	
	
	public void exch(int i,int j){
		Key swap=pq[i];
		pq[j]=pq[i];
		pq[i]=swap;
		
	}
	
	public Key delMin(){
		if(isEmpty()) throw new IllegalArgumentException();
		exch(1,n);
		Key min=pq[n--];
		sink(1);
		pq[n+1]=null;
		return min;
		
	}
	
	@Override
	public Iterator<Key> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	
      public static void main(String args[]){
		
    	  System.out.println("this is here");
		MinPQ<Integer> pq=new MinPQ<Integer>();
		pq.insetKey(2);
		pq.insetKey(4);
		pq.insetKey(1);
		System.out.println("this is here");
		System.out.println(pq.pq[1]);
	
	}
	
	
	
	
}
