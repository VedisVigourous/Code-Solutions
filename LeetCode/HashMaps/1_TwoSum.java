/* Problem: 1 Two Sum
   Link: https://leetcode.com/problems/two-sum/
   Difficulty: Easy 
   Language Used: Java*/

// Solution:
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i< nums.length ; i++){
            int required = target - nums[i];

            if(map.containsKey(required)){
                return new int[] {map.get(required) , i};
            }

            map.put(nums[i] , i);
        }

        return new int[]{};
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
