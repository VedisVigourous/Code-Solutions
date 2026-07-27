/* Problem: 1295 Find Numbers with Even Number of Digits
   Link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
   Difficulty: Easy 
   Language Used: Java*/

// Solution:
class Solution {
    public int findNumbers(int[] nums) {
        int noOfEvenelem = 0;
        for(int elem : nums){
            int count = 0;
            while(elem != 0){
                count++;
                elem /= 10;
            }

            if(count % 2 == 0){
                noOfEvenelem++;
            }
        }
        return noOfEvenelem;
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
