/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designandanalysis;

import jdk.nashorn.internal.objects.Global;

/**
 *
 * @author vik
 */
public class RodCutProblemWithDP {
    
    public int rodCutWithDp(int p[],int n,int r[]){
        int q;
        if(r[n]>=0){
            return r[n];
            
        }
        if(n==0){
            q=0;
        }else
        {q=-1;
        for(int i=1;i<n;i++){
            q=max(q,p[i]+rodCutWithDp(p, n-i, r));
        }
        }
        r[n]=q;
        return q;
    }
    
    public int max(int a,int b){
        if(a>b)return a;
        else return b;
    }
    public int cut(int p[],int n){
         int[] r=new int[n+1];
         
         for(int i=1;i<r.length;i++){
            
             r[i]=-1;
         }
         return rodCutWithDp(p, n, r);
   }
  
    
}
