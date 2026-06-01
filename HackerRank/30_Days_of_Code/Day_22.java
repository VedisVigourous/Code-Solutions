

/* 
 * Day 22: Binary Search Trees
 * Link: https://www.hackerrank.com/challenges/30-binary-search-trees
 * Difficulty: Easy
 * Language Used: Java 8
 *
 */


public static int getHeight(Node root){
    //Write your code here
    if(root == null){
        return -1;
    }
      
    int leftHeight = getHeight(root.left);
    int rightHeight = getHeight(root.right);
      
    return Math.max(leftHeight, rightHeight) + 1;
}




/*
 * Author: Vadanta Kumar Chauhaan
 * HackerRank: https://www.hackerrank.com/profile/codegrounds666
 * GitHub: https://github.com/VedisVigourous
 * LinkedIn: https://www.linkedin.com/in/vadanta
 * Contact: vadanta592007@hotmail.com
 * Copyright (c) 2026 Vadanta Kumar Chauhaan. All rights reserved.
 */
