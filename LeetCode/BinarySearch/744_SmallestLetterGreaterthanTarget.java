/* Problem: 744 Smallest Letter Greater than Target
   Link: https://leetcode.com/problems/find-smallest-letter-greater-than-target/
   Difficulty: Easy 
   Language Used: Java*/

// Solution:
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while(start <= end){
            int mid = start + ((end - start)/2);
            if(letters[mid] <= target){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return letters[start % letters.length];  
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
