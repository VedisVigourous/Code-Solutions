/* 
 * Day 1: Data Types
 * Link: https://www.hackerrank.com/challenges/30-data-types
 * Difficulty: Easy 
 * Language Used: Java 15
 * 
 */

// Solution: 
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        
        Scanner input = new Scanner(System.in);
        int var1 = input.nextInt();
        double var2 = input.nextDouble();
        input.nextLine();
        String var3 = input.nextLine();
        
        System.out.println(i + var1);
        System.out.println(d + var2);
        System.out.println(s + var3);        
    }
}


// Explanation: read int, double, and string inputs, then output summed numeric values and concatenated string.

/* By: Vadanta Kumar Chauhaan
 * HackerRank: https://www.hackerrank.com/profile/codegrounds666
 * GitHub: https://github.com/VedisVigourous
 * Contact vadanta592007@hotmail.com
 */