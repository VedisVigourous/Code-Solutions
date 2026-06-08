/* Problem: Number Line Jumps
   Link: https://www.hackerrank.com/challenges/kangaroo
   Difficulty: Easy 
   Language Used: Java 15*/

// Solution: 
import java.util.Scanner;

class Result {
    public static String kangaroo(int x1 , int v1 , int x2 , int v2){
        while(x1 < x2){
            x1 += v1;
            x2 += v2;

            if(x1 == x2){
                return "YES";
            }
        }
        return "NO";
    }

}


public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int v1 = input.nextInt();
        int x2 = input.nextInt();
        int v2 = input.nextInt();

        System.out.println(Result.kangaroo(x1 , v1 , x2 , v2));
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
