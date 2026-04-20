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
