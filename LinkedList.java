/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydatastructures;

import java.util.Iterator;

/**
 *
 * @author Bikramit Singh
 */
public class LinkedList<Item> implements Iterable<Item> {
    
    Node<Item> head;
    int n;
    public LinkedList() {
        head=null;
        n=0;
   }

    @Override
    public Iterator<Item> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    public class Node<item>{
        Item item;
        Node<Item> next;
        
    }
    
    
    public boolean isEmpty(){
        return n==0;
    }
    
    public void insertAtBegin(Item item){
        Node<Item> newhead=new Node<>();
        newhead.item=item;
        newhead.next=head;
        head=newhead;
        n++;
        //System.out.println("this is insertion");
    }
    
    public void insertAtEnd(Item item){
        
        for(Node x=head;x!=null;x=x.next){
                
            if(x.next==null){
                
                
                
                 Node<Item> oldLast=x;
                 Node<Item> last=new Node<>();
                 last.item=item;
                 oldLast.next=last;
                 last.next=null;
                 n++;
                 System.out.println("this is insertion");
                 break;
            }
        }
    
    }
    
    public void removeFromBegin(){
        head=head.next;
        
    }
    
    public void traverseList(){
        
        for(Node x=head;x!=null;x=x.next){
            
            System.out.print(x.item+"  ");
        }
        
    }
    public void showMeFromEnd(Node<Item> first){
        if(first==null){
            return;
        }
        else{
            showMeFromEnd(first.next);
            System.out.print(first.item+"  ");
        }
            
    }    
    public void reverse(Node<Item> node){
        if(node.next==null){
            head=node;
            return ;
         }
        else{
            reverse(node.next);
            node.next.next=node;
            node.next=null;
            
            
            
        }
    }
    int num;
    public void deleteFormPerticularLocationFromEnd(Node<Item> x,int n){
       
        if(x==null){
            num=n;
            return;
        }
        else{
            deleteFormPerticularLocationFromEnd(x.next,1);
            num--;
           // System.out.println(num);
            if(num==-1){
                x.next=x.next.next;
                return;
            }
            
        }
    }
    
}
