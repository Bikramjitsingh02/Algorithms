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
public class Permutation {
    public void permutation(String str){
        
        permutation("",str);
    }
   public void permutation(String perfix,String str){
       int n=str.length();
       if(n==0){
           System.out.println(perfix);
           
       }
       else{
           for(int i=0;i<n;i++){
               permutation(perfix+str.charAt(i), str.substring(0,i)+str.substring(i+1,n));
           }
       }
       
   }
    
}
