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
public class MergeSort {
   
    public void sort(int[] arr){

      int n=arr.length;
      if(n<2){
      return ;
      }
      int mid=n/2;
      int[] left=new int[mid];
      int[] right=new int[n-mid];
      for(int i=0;i<mid;i++){
          left[i]=arr[i];
       }
      for(int i=mid;i<n;i++){
          right[i-mid]=arr[i];
       }
      
      sort(left);
      sort(right);
      merge(arr,left,right);         
       
    
            
        
        
    }
        public void merge(int[] arr,int[] left,int[] right ){
            int n=arr.length;
            int nl=left.length;
            int nr=right.length;
            
            int i=0,j=0,k=0;
            while(i<nl && j<nr){
                if(left[i]<=right[j]){
                    arr[k]=left[i];
                    i++;
                    k++;
                }else{
                    arr[k]=right[j];
                    j++;
                    k++;
                }
                
            }
            while(i<nl){
                arr[k]=left[i];
                k++;
                i++;
            }
            while(j<nr){
                arr[k]=right[j];
                k++;
                j++;
            }
        
        
        }
    
    
}
