/* Problem: 49. Group Anagrams
   Link: https://leetcode.com/problems/group-anagrams/
   Difficulty: Medium 
   Language Used: Java*/

// Solution:
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List> groupAnagram = new HashMap<>();

        for(String st : strs){
            int [] freqArr = new int[26];

            for(char stCh : st.toCharArray()){
                freqArr[stCh - 'a']++;
            }

            StringBuilder stb = new StringBuilder();
            for(int elem : freqArr){
                stb.append("v");
                stb.append(elem);
            }

            String key = stb.toString();
            if(!groupAnagram.containsKey(key)){
                groupAnagram.put(key, new ArrayList<String>());
            }
            groupAnagram.get(key).add(st);
        }

        return new ArrayList(groupAnagram.values());
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
