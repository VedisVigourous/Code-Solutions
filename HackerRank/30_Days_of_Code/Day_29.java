/*
 * Day 29: Bitwise AND
 * Link: https://www.hackerrank.com/challenges/30-bitwise-and
 * Difficulty: Medium
 * Language Used: Java 15
 *
 */

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            if (((k - 1) | k) <= n) {
                System.out.println(k - 1);
            } else {
                System.out.println(k - 2);
            }
        }
        scanner.close();
    }
}


/* Explanation:
 * For each test case, the code looks for the largest possible bitwise AND
 * value that is still smaller than k. It uses a small bitwise check to decide
 * whether the answer is k - 1 or k - 2, then prints the result.
 */


    
/* By: Vadanta Kumar Chauhaan
 * HackerRank: https://www.hackerrank.com/profile/codegrounds666
 * GitHub: https://github.com/VedisVigourous
 * Contact vadanta592007@hotmail.com
 */