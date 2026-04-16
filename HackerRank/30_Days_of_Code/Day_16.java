/*
 * Day 16: Exceptions - String to Integer
 * Link: https://www.hackerrank.com/challenges/30-exceptions-string-to-integer
 * Difficulty: Easy
 * Language Used: Java 15
 *
 */

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();

        bufferedReader.close();
        
        try{
            int convStr = Integer.parseInt(S);
            System.out.println(convStr);
        }
        catch (Exception error) {
            System.out.println("Bad String");
        }
    }
}
