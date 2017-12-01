/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydatastructures;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author vik
 */
public class TwoSum {
    
    public int[] twoSum(int[] nums,int sum){
        Map<Number,Number> map=new HashMap<>();
        int diff=0;
        
        for(int i=0;i<nums.length;i++){
            map.put(i,nums[i]);
         }
       for(int i=0;i<nums.length;i++){
            diff=sum-nums[i];
       if(map.containsKey(diff)){
           if((Integer)map.get(diff)!=i){
              
                return new int[]{i,(Integer)map.get(diff)};
           }
          
       }     
       }
       
      throw new IllegalArgumentException("No two sum solution");
    }
    
}
