/*
 * Day 19: Interfaces
 * Link: https://www.hackerrank.com/challenges/30-interfaces/
 * Difficulty: Easy
 * Language Used: Java 15
 *
 */

import java.util.Scanner;

interface AdvancedArithmetic{
   int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int sum = 1;
        for(int i = 2; i<=n ; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        return sum;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
