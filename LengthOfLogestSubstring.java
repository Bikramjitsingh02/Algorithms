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
public class LengthOfLogestSubstring {
    
    public int lengthOfLongestSubstring(int[] s){
      
        int n = s.length, ans = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
        //    i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
          //  index[s.charAt(j)] = j + 1;
        }
        return ans;
     
        
        
    }
    
}
