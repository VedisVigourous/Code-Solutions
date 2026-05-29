/*
 * Day 26: Nested Logic
 * Link: https://www.hackerrank.com/challenges/30-nested-logic
 * Difficulty: Easy
 * Language Used: Java 15
 *
 */

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int retDate = input.nextInt();
        int retMonth = input.nextInt();
        int retYear = input.nextInt();
        int dueDate = input.nextInt();
        int dueMonth = input.nextInt();
        int dueYear = input.nextInt();

        if  (retYear > dueYear){
            System.out.println("10000");
        }
        else if ((retMonth > dueMonth) && (retYear == dueYear)){
            int diff = retMonth - dueMonth;
            System.out.println(500 * diff);
        }
        else if((retDate > dueDate) && (retMonth == dueMonth) && (retYear == dueYear)){
            int diff = retDate - dueDate;
            System.out.println(15*diff);
        }
        else {
            System.out.println("0");
        }
    }
}

/* Explanation: 
 This program computes a library fine based on returned and due dates.
 Check conditions from the largest unit to the smallest: year, then month, then day.
 Always check bigger units first because code is evaluated top-to-bottom and left-to-right.
 Examples:
 - If returned year > due year -> fixed fine 10000.
 - Else if same year but returned month > due month -> 500 * month difference.
 - Else if same year and month but returned day > due day -> 15 * day difference.
 - Otherwise -> no fine.

*/




/* By: Vadanta Kumar Chauhaan
 * HackerRank: https://www.hackerrank.com/profile/codegrounds666
 * GitHub: https://github.com/VedisVigourous
 * Contact vadanta592007@hotmail.com
 */