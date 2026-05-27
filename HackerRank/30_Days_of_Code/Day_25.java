/*
 * Day 25: Running Time and Complexity
 * Link: https://www.hackerrank.com/challenges/30-running-time-and-complexity
 * Difficulty: Medium
 * Language Used: Java 15
 *
 */

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        
        while(testCase-->0){
            int n = input.nextInt();
            boolean isPrime = true;
            
            if(n<=1) isPrime = false;
            else {
                for(int i = 2; i*i<=n; i++){
                    if(n%i == 0){
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime){
                System.out.println("Prime");
            }
            else {
                System.out.println("Not prime");
            }
        }
    }
}


// Explanation:
// We only need to try divisors up to sqrt(n). The loop uses i*i<=n
// which is the same as i <= sqrt(n).

/*
 Simple, layman reason:
 - If n = a * b, at least one of a or b is <= sqrt(n).
 - So testing numbers bigger than sqrt(n) isn't needed to find a factor.

 Example (n = 36):
 - sqrt(36) = 6, so test 2,3,4,5,6.
 - 36 % 2 == 0 (2 * 18) so 36 is not prime — we can stop.
 
 - Note: If we do not follow the sqrt(n) rule we would double check all the numbers that is: 
 - 2 * 18 = 18 * 2 
 - 3 * 12 = 12 * 3
 - 4 * 9  =  9 * 4
 - 6 * 6  =  6 * 6

 - Notice, 6 being the optimal spot for ending our checks!

 Benefit: this reduces work to about sqrt(n) checks instead of n.
*/




/* By: Vadanta Kumar Chauhaan
 * HackerRank: https://www.hackerrank.com/profile/codegrounds666
 * GitHub: https://github.com/VedisVigourous
 * Contact vadanta592007@hotmail.com
 */