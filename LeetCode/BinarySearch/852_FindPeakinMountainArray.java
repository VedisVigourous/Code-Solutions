/* Problem: 852 Peak Index in a Mountain Array
   Link: https://leetcode.com/problems/peak-index-in-a-mountain-array/
   Difficulty: Medium
   Language Used: Java*/

// Solution:
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length -1;

        while(low != high){
            int mid = low + ((high - low)/2);

            if (arr[mid] > arr[mid + 1]){
                high = mid;
            }
            else if (arr[mid] < arr[mid + 1]){
                low = mid + 1;
            }
        }
        return low; 
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
