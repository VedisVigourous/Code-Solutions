/* Problem: 34 Find First and Last Position of Element in Sorted Array
   Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
   Difficulty: Medium
   Language Used: Java*/

// Solution:
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] ans = {-1, -1};

        int first = binarySrch(nums, target, true);
        int last = binarySrch(nums, target, false);

        ans[0] = first;
        ans[1] = last;

        return ans;
    }

    int binarySrch(int[] nums, int target, boolean checkFirst){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + ((end - start)/2);

            if(target < nums[mid]){
                end = mid - 1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else {
                ans = mid;
                if(checkFirst){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return ans;
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
