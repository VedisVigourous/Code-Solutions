/* 
 * Day 2: Operators
 * Link: https://www.hackerrank.com/challenges/30-operators
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
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    double tip = (meal_cost/100)*(tip_percent);
    double tax = (meal_cost/100)*(tax_percent);
    
    double totalCost = (meal_cost + tip + tax);
    
    System.out.println(Math.round(totalCost));
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}


// Explanation: compute tip and tax from percentages, add to meal cost, then use Math.round to get the nearest whole total cost.

/*
 * Author: Vadanta Kumar Chauhaan
 * HackerRank: https://www.hackerrank.com/profile/codegrounds666
 * GitHub: https://github.com/VedisVigourous
 * LinkedIn: https://www.linkedin.com/in/vadanta
 * Contact: vadanta592007@hotmail.com
 * Copyright (c) 2026 Vadanta Kumar Chauhaan. All rights reserved.
 */
