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
public class CuttingRod {
   
    
    public CuttingRod() {
            
     
            
    }
    int q;
    public int getMaximumProfit(int[] arr,int n){
        if(n==0){
            return 0;
        }
       q=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            q=Math.max(q,arr[i]+getMaximumProfit(arr, n-i));
        }
        return q;
        
    }
  int[] r;  
   public void getProfit(int[] p){
   r=new int[p.length];
  
       int x=getProfit(p,p.length-1);
  
     System.out.println(x);
   }
   
    public int getProfit(int[] p,int n){
        r[0]=0;
        for(int j=1;j<=n;j++){
            q=Integer.MIN_VALUE;
           for(int i=1;i<=j;i++){
               q=Integer.max(q, p[i]+r[j-i]);
           } 
           r[j]=q;
           
            
        }
        return r[n];
    }
    
    
    
}
