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
public class NQueenProblem {
    
    int n;
    int[] arr;
    
    public void intialize(int n){
        this.n=n;
        arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i;
        }
        solution(0);
    }
     public void print(){
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
    public void solution(int k){
        if(k==n){
            print();
            return;
        }
        for(int i=k;i<n;i++){
            swap(arr,i,k);
            solution(k+1);
            swap(arr, i, k);
        }
    }
     public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
      }
    
}
