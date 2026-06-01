

/* 
 * Day 9: Recursion 3
 * Link: https://www.hackerrank.com/challenges/30-recursion
 * Difficulty: Easy 
 * Language Used: Java 15
 * 
 */

// Solution: 
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'factorial' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int factorial(int n) {
        // Base Conditioni
        if((n == 0) || (n == 1)){
            return 1;
        }
        else {
            // Recursive Call
            return n * factorial(n-1);
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.factorial(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}



// ================================================================================== //

/* -- Explanation: Calculate the factorial of a number using recursion.
   
   -- Logic used: 
      1. Read an integer n from input
      2. Call the factorial function with n as the parameter
      3. The factorial function uses recursion to calculate n!
      4. Print the result
   
   -- Recursion breakdown:
      - Base case: If n is 0 or 1, return 1 (since 0! = 1 and 1! = 1)
      - Recursive case: Return n * factorial(n-1)
      
   -- Example: factorial(5)
      - factorial(5) = 5 * factorial(4) => 5 * 24 = 120
      - factorial(4) = 4 * factorial(3) => 4 * 6 = 24
      - factorial(3) = 3 * factorial(2) => 3 * 2 = 6
      - factorial(2) = 2 * factorial(1) => 2 * 1 = 2
      - factorial(1) = 1 (base case)
      - Result: 5 * 4 * 3 * 2 * 1 = 120
      
   -- Key Points:
      - Recursion is when a function calls itself
      - Every recursive function needs a base case to stop the recursion
      - Each recursive call reduces the problem size (n-1)
      - The call stack builds up and then unwinds to calculate the final result
*/

// =================================================================================== //



/*
 * Author: Vadanta Kumar Chauhaan
 * HackerRank: https://www.hackerrank.com/profile/codegrounds666
 * GitHub: https://github.com/VedisVigourous
 * LinkedIn: https://www.linkedin.com/in/vadanta
 * Contact: vadanta592007@hotmail.com
 * Copyright (c) 2026 Vadanta Kumar Chauhaan. All rights reserved.
 */
