/* Problem: Apple and Orange
   Link: https://www.hackerrank.com/challenges/apple-and-orange
   Difficulty: Easy 
   Language Used: Java 15*/

// Solution: 
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void countApplesAndOranges(int s, int t, int a, int b, ArrayList<Integer> apples, ArrayList<Integer> oranges) {
        int countApples = 0;
        int countOranges = 0;
        
        for(int elem : apples){
            int position = a + elem;
            if(position >= s && position <= t){
                countApples++;
            }
        }
        
        for(int elem : oranges){
            int position = b + elem;
            if(position >= s && position <= t){
                countOranges++;
            }
        }
        
        System.out.println(countApples);
        System.out.println(countOranges);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        int t = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();
        
        ArrayList<Integer> apples = new ArrayList<>(); 
        ArrayList<Integer> oranges = new ArrayList<>();
        
        int noOfApples = input.nextInt();
        int noOfOranges = input.nextInt();
        for(int i = 0 ; i < noOfApples ; i++){
            int value = input.nextInt();
            apples.add(value);
        }
        
        for(int i = 0 ; i < noOfOranges ; i++){
            int value = input.nextInt();
            oranges.add(value);
        }        
        
        countApplesAndOranges(s , t , a , b , apples , oranges);
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
