/* Problem: Time Conversion
   Link: https://www.hackerrank.com/challenges/time-conversion
   Difficulty: Easy 
   Language Used: Java 15*/

// Solution: 
import java.io.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;

class Result {
    public static String timeConversion(String s) {
        DateTimeFormatter received = DateTimeFormatter.ofPattern("hh:mm:ssa");
        DateTimeFormatter send = DateTimeFormatter.ofPattern("HH:mm:ss");
        
        LocalTime time = LocalTime.parse(s , received);
        return time.format(send);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
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
