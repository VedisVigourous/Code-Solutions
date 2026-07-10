/* Problem: Divisible Sum Pairs
   Link: https://www.hackerrank.com/challenges/divisible-sum-pairs
   Difficulty: Easy 
   Language Used: Java 15*/

// Solution:
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Result {
    public static int divisibleSumPairs(int n, int k, List<Integer> ar){
        int count = 0;

        for(int i = 0 ; i < n; i++){
            for(int j = i+1; j < n; j++){
                if((ar.get(i) + ar.get(j)) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();

        List<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            int value = input.nextInt();
            arr.add(value);
        }

        System.out.println(Result.divisibleSumPairs(n, k, arr));
    }
}

/*
 * Author: Vadanta Kumar Chauhaan
 * HackerRank: https://www.hackerrank.com/profile/codegrounds666
 * GitHub: https://github.com/VedisVigourous
 * LinkedIn: https://www.linkedin.com/in/vadanta
 * Contact: vadanta592007@hotmail.com
 * Copyright (c) 2026 Vadanta Kumar Chauhaan. All rights reserved.
 */