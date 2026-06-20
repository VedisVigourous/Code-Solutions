/* Problem: Subarray Division
   Link: https://www.hackerrank.com/challenges/the-birthday-bar
   Difficulty: Easy 
   Language Used: Java 15*/

// Solution: 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Result {
    public static int birthday(List<Integer> s , int d , int m) {
        int count = 0;

        for(int i = 0 ; i <= s.size() - m ; i++){
            int sum = 0;

            for(int j = i ; j < i + m ; j++){
                sum += s.get(j);
            }

            if(sum == d){
                count++;
            }
        }
        return count;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();

        List<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < length ; i++){
            int elem = input.nextInt();
            arr.add(elem);
        }

        int sumReq = input.nextInt();
        int subArrLenght = input.nextInt();

        System.out.println(Result.birthday(arr , sumReq , subArrLenght));
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
