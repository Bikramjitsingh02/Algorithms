/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydatastructures;

import java.util.Iterator;

/**
 *
 * @author Bikramjit Singh
 */
public class Stack<Item> implements Iterable<Item> {
    
    Node<Item> top;
    int n;

    public Stack() {
      top=null;
      n=0;
    }
    
     
    public class Node<item>{
        Item item;
        Node<Item> next;
        
    }
    
     
    
    public int  size(){
        return n;
    }
    
    
    public boolean isEmpty(){
        return size()==0;
    }
    
    public void push(Item item){
      Node<Item> newtop=new Node<>();
      newtop.item=item;
      newtop.next=top;
      top=newtop;
      n++;
    }
    
    public Item pop(){
       
        Item item=top.item;
        top=top.next;
        n--;
        return item;
    }

    public void traverse(){
        for(Node x=top;x!=null;x=x.next){
            
            System.out.println(x.item);
        }
    }
    @Override
    public Iterator<Item> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
