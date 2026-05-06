/*
 * Day 20: Sorting
 * Link: https://www.hackerrank.com/challenges/30-sorting
 * Difficulty: Easy
 * Language Used: Java 15
 *
 */

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



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        // Write your code here
        int noOfSwaps = 0;
        for(int i = 0 ; i < a.size() ; i++){
            for(int j = 0 ; j < a.size() - i - 1 ; j++){
                if(a.get(j) > a.get(j+1)){
                    Collections.swap(a, j, j+1);
                    noOfSwaps++;
                }
            }
        }

        bufferedReader.close();
        
        System.out.printf("Array is sorted in %d swaps.\n" , noOfSwaps);
        System.out.printf("First Element: %d\n" , a.get(0));
        System.out.printf("Last Element: %d" , a.get(n-1));
    }
}
