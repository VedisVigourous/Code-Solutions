/* Problem: 3723 Maximize Sum of Squares of Digit
   Link: https://leetcode.com/problems/maximize-sum-of-squares-of-digits
   Difficulty: Medium 
   Language Used: Java*/

// Solution:
class Solution {
    public String maxSumOfSquares(int num, int sum) {        
        if (sum > num * 9) {
            return "";
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            int digit = Math.min(9, sum);
            sb.append(digit);
            sum -= digit;
        }
        
        return sb.toString();
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