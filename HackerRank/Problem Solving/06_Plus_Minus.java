/* Problem: Plus Minus
   Link: https://www.hackerrank.com/challenges/plus-minus
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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    int negativeNo = 0;
    int positiveNo = 0;
    int zero = 0;
    for (int elements : arr){
        if (elements < 0){
            negativeNo++;
        }
        else if (elements>0){
            positiveNo++;
        }
        else {
            zero++;
        }
    }
        
        float pratio = (float) positiveNo/arr.size();
        float nratio = (float) negativeNo/arr.size();
        float zratio = (float) zero/arr.size();
        
        System.out.printf("%6f\n" , pratio);
        System.out.printf("%6f\n" , nratio);
        System.out.printf("%6f\n" , zratio);

    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

