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
public class BinaryCounter {
    
    private int n;
    private int[] arr;
    private String str;
    public void getCombinationOfString(String str){
        this.str=str;
        getBinaryNumbers(str.length());
                
    }
    public void getBinaryNumbers(int n){
        this.n=n;
        this.arr=new int[n];
        getBinary(0);
        
    }
   public void getBinary(int k){
       if(k==n){
           print();
           return;
       }
       getBinary(k+1);
       arr[k]=1;
       getBinary(k+1);
       arr[k]=0;
   }
   public void print(){
       System.out.print("{ ");
       for(int i=0;i<n;i++){
           if(arr[i]==1){
            System.out.print(str.charAt(i)+",");
           }
       }
       System.out.println("}");
       
   }
}
