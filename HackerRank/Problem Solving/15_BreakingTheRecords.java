/* Problem: Breaking the Records
   Link: https://www.hackerrank.com/challenges/breaking-best-and-worst-records
   Difficulty: Easy 
   Language Used: Java 15*/

// Solution: 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Result {
    public static List<Integer> breakingRecords(List<Integer> scores){
        int maxRecord = 0;
        int minRecord = 0;

        int bestScore = scores.get(0);
        int leastScore = scores.get(0);

        for(int i = 1; i < scores.size() ; i++){
            if(scores.get(i) > bestScore){
                maxRecord++;
                bestScore = scores.get(i);
            }
            else if (scores.get(i) < leastScore) {
                minRecord++;
                leastScore = scores.get(i);
            }
        }


        return List.of(maxRecord , minRecord);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfGames = input.nextInt();

        List<Integer> scoresProvided = new ArrayList<>();

        for(int i = 0 ; i < numberOfGames ; i++){
            int score = input.nextInt();
            scoresProvided.add(score);
        }

        List<Integer> result = Result.breakingRecords(scoresProvided);
        
        System.out.println(result.get(0) + " " + result.get(1));
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
