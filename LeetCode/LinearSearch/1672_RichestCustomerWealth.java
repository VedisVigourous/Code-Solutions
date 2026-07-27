/* Problem: 1672. Richest Customer Wealth
   Link: https://leetcode.com/problems/richest-customer-wealth/
   Difficulty: Easy 
   Language Used: Java*/

// Solution:
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;

        for(int i = 0 ; i < accounts.length; i++){
            int sum = 0;
            for(int j = 0 ; j < accounts[i].length; j++){
                sum += accounts[i][j];
            }

            if(sum > maxWealth){
                maxWealth = sum;
            }
        }
        return maxWealth;
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
