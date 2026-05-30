/*
 * Day 28: RegEx, Patterns, and Intro to Databases
 * Link: https://www.hackerrank.com/challenges/30-regex-patterns
 * Difficulty: Medium
 * Language Used: Java 15
 *
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<String> validNames = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String firstName = scanner.next();
            String emailID = scanner.next();

            if (emailID.endsWith("@gmail.com")) {
                validNames.add(firstName);
            }
        }

        scanner.close();

        Collections.sort(validNames);
        for (String name : validNames) {
            System.out.println(name);
        }
    }
}

/* Explanation:
 * The code reads a list of people and checks which email addresses end with
 * "@gmail.com". It keeps only those first names, sorts them in alphabetical
 * order, and prints them one by one.
 */
    
    
/* By: Vadanta Kumar Chauhaan
 * HackerRank: https://www.hackerrank.com/profile/codegrounds666
 * GitHub: https://github.com/VedisVigourous
 * Contact vadanta592007@hotmail.com
 */