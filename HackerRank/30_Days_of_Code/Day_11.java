

/* 
 * Day 11: 2D Arrays
 * Link: https://www.hackerrank.com/challenges/30-2d-arrays
 * Difficulty: Easy 
 * Language Used: Java 15
 * 
 */

import java.util.Scanner;


public class Solution {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        /* Taking the Input of the 2D Array */
        
        int [][] arr = new int [6][6];
        for(int row = 0; row<6 ; row++){
            for(int col = 0; col<6 ; col++){
                arr[row][col] = input.nextInt();
            }
        }

        /* Defining the maxSum variable to store the maximum sum of the hourglass and a variable sum to store the sum of the current hourglass */
        
        int maxSum = Integer.MIN_VALUE;
        int sum;

        /* Looping through the required indices of the 2D array to calculate the sum of the hourglass and comparing it with the maxSum variable to find the maximum sum of the hourglass */
         
        for (int i = 0; i<=3 ; i++){
            for(int j = 0 ; j<=3 ; j++){
                sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];  
                 
                if(sum > maxSum){
                maxSum = sum;
                }
            }
        }
        
        System.out.println(maxSum);
    }
}

/* -- Explanation: Scan every possible 3x3 hourglass in the 6x6 matrix, compute each sum, and keep the maximum one found.

   -- Logic used:
      1. Read the full 6x6 grid into a 2D array
      2. Move a 3x3 window across all valid starting positions
      3. Sum the 7 hourglass cells for each window
      4. Track and print the largest sum
*/



/*
 * Author: Vadanta Kumar Chauhaan
 * HackerRank: https://www.hackerrank.com/profile/codegrounds666
 * GitHub: https://github.com/VedisVigourous
 * LinkedIn: https://www.linkedin.com/in/vadanta
 * Contact: vadanta592007@hotmail.com
 * Copyright (c) 2026 Vadanta Kumar Chauhaan. All rights reserved.
 */
