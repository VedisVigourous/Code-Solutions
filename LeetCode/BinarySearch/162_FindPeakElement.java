/* Problem: 1095 Find in Mountain Array
   Link: https://leetcode.com/problems/find-in-mountain-array/
   Difficulty: Hard
   Language Used: Java*/

// Solution:
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int low = 0;
        int high = mountainArr.length() - 1;

        while(low!=high){
            int mid = low + ((high - low)/2);

            if(mountainArr.get(mid) < mountainArr.get(mid+1)){
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }

        int resultIncreasing = increasingPeak(mountainArr, target, high);
        int resultDecreasing = decreasingPeak(mountainArr, target, high);

        if(resultIncreasing != -1){
            return resultIncreasing;
        }
        else if (resultDecreasing != -1){
            return resultDecreasing;
        }
        else {
            return -1;
        }        
    }

    public int increasingPeak(MountainArray mountainArr , int target, int peak){
        int low = 0;
        int high = peak;

        while(low<=high){
            int mid = low + ((high - low)/2);

            if (target < mountainArr.get(mid)){
                high = mid - 1;
            }
            else if (target > mountainArr.get(mid)){
                low = mid + 1;
            }
            else if (target == mountainArr.get(mid)){
                return mid;
            }
        }
        return -1;
    }

    public int decreasingPeak(MountainArray mountainArr , int target, int peak){
        int low = peak;
        int high = mountainArr.length()-1;

        while(low<=high){
            int mid = low + ((high - low)/2);

            if (target > mountainArr.get(mid)){
                high = mid - 1;
            }
            else if (target < mountainArr.get(mid)){
                low = mid + 1;
            }
            else if (target == mountainArr.get(mid)){
                return mid;
            }
        }
        return -1;
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
