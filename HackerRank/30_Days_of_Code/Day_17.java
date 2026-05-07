/*
 * Day 17: More Exceptions
 * Link: https://www.hackerrank.com/challenges/30-more-exceptions
 * Difficulty: Easy
 * Language Used: Java 15
 *
 */

import java.util.Scanner;

class Calculator {
    
    int power(int base , int pow) throws ArithmeticException{
        
        if((base<0) || (pow<0)) {
            throw new ArithmeticException();
        }
        int result = 1;
        for(int i = 1; i <= pow ; i++){
            result *= base;
        }
        return result;        
    }
}
public class Solution {

    public static void main(String[] args) {        
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        
        while(test-- > 0){
            int n = input.nextInt();
            int p = input.nextInt();
            
            Calculator obj = new Calculator();
            
            try {
                System.out.println(obj.power(n , p));
            }
            catch (ArithmeticException e){
                System.out.println("n and p should be non-negative");
            }
        }
    }
}

/* -- Explanation: Build a calculator method that computes base^power, while rejecting negative inputs with an exception.

   -- Logic used:
      1. Read each test case with a base and exponent
      2. Throw ArithmeticException if either value is negative
      3. Otherwise multiply the base repeatedly power times
      4. Print the result or the required error message
*/

/* By: Vadanta Kumar Chauhaan
 * HackerRank: https://www.hackerrank.com/profile/codegrounds666
 * GitHub: https://github.com/VedisVigourous
 * Contact vadanta592007@hotmail.com
 */
