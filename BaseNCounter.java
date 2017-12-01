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
public class BaseNCounter {
    int[] arr;
    int n;
    int r;
    public void count(int k){
        if(k==n){
            print();
            return;
        }
       
        count(k+1);
        arr[k]=1;  
        count(k+1);
        arr[k]=0;
       
        
 }
    
    public void print(){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void intialise(int n,int r){
        this.n=n;
        arr=new int[n];
        this.r=r;
        getBaseN(0);
    }
    public void getBaseN(int k){
        if(k==n){
            print();
            return;
        }
       
           
           for(int i=0;i<r;i++){
           arr[k]=i;
           getBaseN(k+1);
           
       } 
    }
    
}
