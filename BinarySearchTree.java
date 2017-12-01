/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydatastructures;

/**
 *
 * @author vik
 */
public class BinarySearchTree {
    
    Node root;
    public class Node{
        int key;
        String data; 
        Node left;
        Node right;
        int size;
        public Node(int key,String data,int size){
            this.key=key;
            this.data=data;
            this.size=size;
        }
    }
    public boolean isEmpty(){
       
        return root==null;
    }
    public void insertKey(int key,String data){
        
        root=insertKey(root,key, data);
       
        
    }
    public Node insertKey(Node node,int key ,String data){
        
       if(node==null){
           return new Node(key,data,1);
       }
        if(key>node.key){
         node.right=insertKey(node.right, key, data);
        }else if(key<node.key){
         node.left=insertKey(node.left, key, data);   
        }
        else{
            node.key=key;
            node.data=data;
            node.size=size(node.left)+size(node.right)+1;
        }
        return node;
    }
   public void preOrder(){
       preOrder(root);
   }
    public void preOrder(Node node){
       if(node==null){
           return;
       }
        System.out.println(node.key + "   "+node.data);
        preOrder(node.left);
        preOrder(node.right);
        
    }
    
    public int size(){
        return size(root);
    }
    public int size(Node x){
        if(x==null){
            return 0;
        }
        return size(x.left)+size(x.right)+1;
    }
  
    public int height(){
        return height(root);
    }
    public int height(Node x){
        if(x==null){
            return -1;
        }
               
        return Integer.max(height(x.left),height(x.right))+1;
    }
    
   // public boolean isBinaryTree(){
     //   return isBinaryTree(root)==1;
        
    //}
    public int sign;
    public void isBinaryTree(Node x){
        if(x.left==null||x.right==null){
            return ;
            
        }
        int k=x.key;
        if(k>x.left.key && k<x.right.key){
            isBinaryTree(x.left);
            isBinaryTree(x.right);
            sign= 1;
        }else{
        sign= 0;    
        }
        
        if(sign==0){
            System.out.println(false);
        }else{
            System.out.println(true);
        }
       
    }
    public int rank(int key){
        return rank(root,key);
    }
   
    public int rank(Node x,int key){
           
        if(x==null){
            return 0;
        }
        
        if(key>x.key){
            return size(x.left)+1+rank(x.right,key);
            
        }else if(key<x.key){
           return rank(x.left,key);
        }else {
            return size(x.left)+1;
        }
        
        
    } 
    
    public void revert(){
        revert(root);
    }
    public void revert(Node x){
        if(x==null){
            return ;
        }
        revert(x.left);
        revert(x.right);
       
        Node temp;
        temp=x.left;
        x.left=x.right;
        x.right=temp;
       
       
    }
}
