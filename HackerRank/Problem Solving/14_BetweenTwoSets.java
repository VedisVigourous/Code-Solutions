/* Problem: Between Two Sets
   Link: https://www.hackerrank.com/challenges/between-two-sets
   Difficulty: Easy 
   Language Used: Java 15*/

// Solution: 
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Result {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int validCount = 0;

        int start = Collections.max(a);
        int end = Collections.min(b);

        for (int i = start; i <= end; i++) {
            boolean isValid = true;

            for (int numA : a) {
                if (i % numA != 0) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                for (int numB : b) {
                    if (numB % i != 0) {
                        isValid = false;
                        break;
                    }
                }
            }

            if (isValid) {
                validCount++;
            }
        }

        return validCount;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstArr = input.nextInt();
        int secondArr = input.nextInt(); 

        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < firstArr; i++) {
            a.add(input.nextInt());
        }

        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < secondArr; i++) { 
            b.add(input.nextInt());
        }

        System.out.println(Result.getTotalX(a, b));
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
