/* Problem: 3727 Maximum Alternating Sum of Squares
   Link: https://leetcode.com/problems/maximum-alternating-sum-of-squares
   Difficulty: Medium 
   Language Used: Java*/

// Solution:
class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] squares = new long[n];
        
        for (int i = 0; i < n; i++) {
            squares[i] = (long) nums[i] * nums[i];
        }

        Arrays.sort(squares);
        
        long maxScore = 0;
        int elementsToSubtract = n / 2; 

        for (int i = 0; i < n; i++) {
            if (i < elementsToSubtract) {
                maxScore -= squares[i];
            } else {
                maxScore += squares[i];
            }
        }
        
        return maxScore;
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