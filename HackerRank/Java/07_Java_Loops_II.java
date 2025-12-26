/* Problem: Java Loops II
   Link: https://www.hackerrank.com/challenges/java-loops
   Difficulty: Easy 
   Language Used: Java8*/

// Solution:
import java.util.*;
import java.io.*;
import java.lang.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int ans = a;
            int pow = 0;
            for (int term = 1 ; term <= n ; term++){
                double power = Math.pow(2, pow);
                ans += power*b;
                System.out.print(ans + " ");
                pow++;
            }
            
            System.out.println();
        }
        in.close();
    }
}
