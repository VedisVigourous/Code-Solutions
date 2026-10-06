/* Problem: 242. Valid Anagram
   Link: https://leetcode.com/problems/valid-anagram/
   Difficulty: Easy 
   Language Used: Java*/

// Solution:
class Solution {
    public boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;

        int [] charFreq = new int[26];

        char [] sArr = s.toCharArray();
        char [] tArr = t.toCharArray();

        for(int i = 0; i < s.length(); i++){
            charFreq[sArr[i] - 'a']++;
            charFreq[tArr[i] - 'a']--;
        }

        for(int i = 0 ; i < charFreq.length; i++){
            if(charFreq[i] > 0) return false;
        }

        return true;
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
