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