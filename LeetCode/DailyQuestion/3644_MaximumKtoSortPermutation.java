/* Problem: 3644 Maximum K to Sort a Permutation
   Link: https://leetcode.com/problems/maximum-k-to-sort-a-permutation/
   Difficulty: Medium 
   Language Used: Java*/

// Solution:
class Solution {
    public int sortPermutation(int[] nums) {
        int k = -1;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                if (k == -1) {
                    k = nums[i]; 
                } else {
                    k &= nums[i]; 
                }
            }
        }
        return k == -1 ? 0 : k;
    }
}

/*
 * Author: Vadanta Kumar Chauhaan
 * LeetCode: https://leetcode.com/u/vedisvigourous/
 * GitHub: https://github.com/VedisVigourous
 * LinkedIn: https://www.linkedin.com/in/vadanta
 * Contact: vadanta592007@hotmail.com
 * Copyright (c) 2026 Vadanta Kumar Chauhaan. All rights reserved.
 */