

/* 
 * Day 14: Scope
 * Link: https://www.hackerrank.com/challenges/30-scope 
 * Difficulty: Easy
 * Language Used: Java 15
 *
 */

import java.util.Scanner;
import java.util.Arrays;

class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference(int [] arr){
        this.elements = arr;
    }

    public void computeDifference() {
        /* 
        // APPROACH 1: Brute Force (My original logic)
        // Time Complexity: O(N^2)
        this.maximumDifference = 0;
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                int diff = Math.abs(elements[i] - elements[j]);
                if (diff > maximumDifference) {
                    maximumDifference = diff;
                }
            }
        }
        */
       

        // APPROACH 2: Optimized Sorting (My final solution)
        // Time Complexity: O(N log N)
        Arrays.sort(elements);
        this.maximumDifference = Math.abs(elements[elements.length - 1] - elements[0]);
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

/* -- Explanation: Find the maximum absolute difference between any two elements by sorting the array and comparing the smallest and largest values.

   -- Logic used:
      1. Read all integers into an array
      2. Sort the array in ascending order
      3. Subtract the first element from the last element
      4. Store the result in maximumDifference and print it
*/



/*
 * Author: Vadanta Kumar Chauhaan
 * HackerRank: https://www.hackerrank.com/profile/codegrounds666
 * GitHub: https://github.com/VedisVigourous
 * LinkedIn: https://www.linkedin.com/in/vadanta
 * Contact: vadanta592007@hotmail.com
 * Copyright (c) 2026 Vadanta Kumar Chauhaan. All rights reserved.
 */
