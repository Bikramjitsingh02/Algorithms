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
public class PermutationOfAnArray {
    
    public void permutation(String s){
        char[] arr=new char[s.length()];
        for(int i=0;i<s.length();i++){
           arr[i]=s.charAt(i);
        }
        permutation(arr,s.length());
        
    }
    public void permutation(char[] arr,int n){
        if(n==1){
            System.out.println(new String(arr));
        }
        for(int i=0;i<n;i++){
            swap(arr,i,n-1);
            permutation(arr, n-1);
            swap(arr,i,n-1);
            
        }
        
    }
    public void swap(char[] arr,int i,int j){
        char temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
