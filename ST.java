/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydatastructures;

/**
 *
 * @author Bikramjit Singh
 */
public class ST<Key ,Value>  {
    private int n;
    private Node first;

   
    
    public class Node{
        Key key;
        Value value;
        Node next;
        
        Node(Key key,Value value,Node next){
            this.key=key;
            this.value=value;
            this.next=next;
            
        }       
        
        
    }
    
    ST(){
       
    }
    public int size(){
        return n;
    }
    public boolean isEmpty(){
        return size()==0;
    }
    public boolean contains(Key key){
        if(key==null) throw new IllegalArgumentException("argument to contains is null");
        return get(key)!=null;
    }
    
    public void put(Key key,Value value){
        if(key==null) throw new IllegalArgumentException("argument to put is null");
        if(value==null) {
            deleteKey(key);
             return;     
        }
        for(Node x=first;x!=null;x=x.next){
            if(key.equals(x.key)){
                x.value=value;
                return;
            }
        }
        first=new Node(key,value,first);
        n++;
    }
    public Key get(Key key){
        return null;
    } 
    public void deleteKey(Key key){
        if(key==null) return;
        
        first=deleteNode(first,key);
            
           
        }
    
     private Node deleteNode(Node x, Key key) {
      if(x==null) return null;
      if(key.equals(x.key)){
          n--;
          return x.next;
      }
      x.next=deleteNode(x.next, key);
      return x;
    }
    public void traverseList(){
        System.out.println("this is traverse");
        for(Node x=first;x!=null;x=x.next){
            
            System.out.println(x.key + (String)x.value );
        }
        
    }
        
        
    
}
