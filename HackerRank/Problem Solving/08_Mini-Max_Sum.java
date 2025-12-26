/* Problem: Mini-Max Sum
   Link: https://www.hackerrank.com/challenges/mini-max-sum
   Difficulty: Easy 
   Language Used: Java8*/

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

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    long maxNum = Collections.max(arr);
    long minNum = Collections.min(arr);
    
    long totalSum = 0;
    
    for(long elements : arr){
        totalSum += elements;
    }
    
    System.out.print(totalSum - maxNum + " ");
    System.out.print(totalSum - minNum);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
