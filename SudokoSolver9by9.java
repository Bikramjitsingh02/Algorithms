/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydatastructures;

/**
 *
 * @author bikramjit Singh
 */
public class SudokoSolver9by9 {
    int[] arr;
    int r;
    
    public void intialise(int numOfDigits,int base){
        arr=new int[numOfDigits];
        r=base;
        enumurate(0);
    }
    public  void print(){
        for(int i=0;i<arr.length;i++){
            if(i%9==0){
                System.out.println();
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void enumurate(int k){
        if(k==81){
            print();
            return;
        }
        
        if(arr[k]!=0){
            enumurate(k+1);
            return;
        }
        
        for(int x=0;x<r;x++){
            arr[k]=x;
            if(!canBacktrack(k))
                enumurate(k+1);
        }
        arr[k]=0;
    }

    private boolean canBacktrack(int k) {
        {
for (int i = 0; i < k; i++)
{
if ((arr[i] - arr[k]) == (k - i)) return true;
if ((arr[k] - arr[i]) == (k - i)) return true;
}
return false;
}
     
    
    }
}
