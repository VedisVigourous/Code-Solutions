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

/* -- Explanation: Read a string and try to convert it into an integer; if conversion fails, print "Bad String".

   -- Logic used:
      1. Read the input as a string
      2. Attempt Integer.parseInt on the string
      3. Print the parsed value if conversion succeeds
      4. Catch any exception and print "Bad String"
*/

/* By: Vadanta Kumar Chauhaan
 * HackerRank: https://www.hackerrank.com/profile/codegrounds666
 * GitHub: https://github.com/VedisVigourous
 * Contact vadanta592007@hotmail.com
 */
