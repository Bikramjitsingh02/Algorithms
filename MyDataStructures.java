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
public class MyDataStructures {
   
    public static void main(String[] args) {
  
        BinarySearchTree bst=new BinarySearchTree();
      
        bst.insertKey(33,"heyfffffff");
        bst.insertKey(311,"heywdscs");
        bst.insertKey(332,"heffdfy");
        bst.insertKey(345,"hffffy");
        bst.insertKey(223,"heffffy");
        bst.insertKey(3,"hey");
        bst.insertKey(5,"no");
        bst.insertKey(6,"y");
        bst.insertKey(34,"me");
        bst.insertKey(2,"sdfdy");
        bst.insertKey(23,"hffff");
        
          int[] arr={13,25,8,9,10,17,20,24,30};
        //  CuttingRod cd=new CuttingRod();
          //cd.getProfit(arr);
         
        bst.revert();
       System.out.println(bst.root.left.right.key);
    }
    
}
