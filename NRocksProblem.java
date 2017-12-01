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
public class NRocksProblem {
    
    int n;
    int[] arr;
    public void printSolution(int n){
        this.n=n;
        this.arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i;
        }
        getMeSolution(arr,arr.length);
    }
    
    public void print(){
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
    public void getMeSolution(int[] arr,int n){
        if(n==1){
            print();
            return;
        }
        for(int i=0;i<n;i++){
            swap(arr,i,n-1);
            getMeSolution(arr, n-1);
            swap(arr,i,n-1);
        }
        
    }
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
      }

    

}
