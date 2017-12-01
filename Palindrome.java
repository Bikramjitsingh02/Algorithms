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
public class Palindrome {
    
   static long rev=0;
    
    public static  long reverse(long num){
    
        if(num==0){
            return 0;
        }
        
        rev=rev*10;
        rev=rev+num%10;
        
        reverse(num/10);
        return rev;
    }
             
            
}
