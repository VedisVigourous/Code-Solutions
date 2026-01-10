/* Problem: Welcome to Java! 
   Link: https://www.hackerrank.com/challenges/java-static-initializer-block
   Difficulty: Easy 
   Language Used: Java8*/

// Solution:
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int B;
    public static int H;
    public static boolean flag = true;
    
    // Note: Static initializer block is always executed once when the class is loaded into memory.
    static {
        Scanner input = new Scanner(System.in);
        B = input.nextInt();
        H = input.nextInt();
        
        if(B<=0 || H<=0){
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
//Write your code here

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

