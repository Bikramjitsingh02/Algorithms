package javaProjectNew;

import java.util.Iterator;

public class PriorityQueue<Key extends Comparable<Key>>  {
	private Key[] pq;
	public int n;
	
	
	public PriorityQueue(int n){
		pq=(Key[]) new Object[n+1];
		this.n=0;
		
		
	}

	
	public boolean isEmpty(){
		return n==0;
	}
	
	public int  size(){
		return n;
	}
	
	public Key min(){
		if(isEmpty()) throw new IllegalArgumentException();
		return pq[1];
	}
	
	
	public void insert(Key x){
		
		pq[++n]=x;
		swim(n);
		
		
		
	}
	public void swim(int k){
		
		while( k>1 && less(k/2,k))
		{
			exch(k/2,k);
			k=k/2;
		}
		
	}
	
	public void exch(int i,int j){
		Key temp;
		temp=pq[i];
		pq[i]=pq[j];
		pq[j]=temp;
		
	}
	
	public boolean less(int i,int j){
		
		int cmp;
		cmp= pq[i].compareTo(pq[j]);
		
		if(cmp<1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public static void main(String args[]){
		PriorityQueue<Integer> MinPQ=new PriorityQueue<Integer>(5);
		MinPQ.insert(3);
		MinPQ.insert(4);
		MinPQ.insert(6);
		MinPQ.insert(1);
		MinPQ.insert(10);
		System.out.println(MinPQ.pq[1]);
	}
	
	

	
	
}
