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

