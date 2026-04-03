/*
 * Day 14: Scope
 * Link: https://www.hackerrank.com/challenges/30-scope 
 * Difficulty: Easy
 * Language Used: Java 15
 *
 */

import java.util.Scanner;

class Difference {
      private int[] elements;
      public int maximumDifference;
    
    Difference (int [] arr){
        this.elements = arr;
    }
    
    void computeDifference(){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0 ; i < elements.length ; i++){
            if(elements[i] > max){
                max = elements[i];
            }
            if(elements[i] < min){
                min = elements[i];
            }
        }
        
        maximumDifference = max - min;
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