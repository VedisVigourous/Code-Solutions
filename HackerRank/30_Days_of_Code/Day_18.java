

/* 
 * Day 18: Queues and Stacks
 * Link: https://www.hackerrank.com/challenges/30-queues-stacks/
 * Difficulty: Easy
 * Language Used: Java 15
 *
 */

import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Solution {
    Stack<Character> stc = new Stack<>();
    Queue<Character> qu = new LinkedList<>();

    public void pushCharacter(char ch) {
        stc.push(ch);
    }

    public void enqueueCharacter(char ch) {
        qu.offer(ch);
    }

    public char popCharacter() {
        return stc.pop();
    }

    public char dequeueCharacter() {
        return qu.poll();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        char[] s = input.toCharArray();

        Solution p = new Solution();

        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );

    }
}

/* -- Explanation: Use a stack and a queue to compare a word from both ends and determine whether it is a palindrome.

    -- Logic used:
        1. Read the input word and split it into characters
        2. Push each character onto a stack and enqueue it into a queue
        3. Compare the popped and dequeued characters for half the string
        4. Print whether the word is a palindrome
*/



/*
 * Author: Vadanta Kumar Chauhaan
 * HackerRank: https://www.hackerrank.com/profile/codegrounds666
 * GitHub: https://github.com/VedisVigourous
 * LinkedIn: https://www.linkedin.com/in/vadanta
 * Contact: vadanta592007@hotmail.com
 * Copyright (c) 2026 Vadanta Kumar Chauhaan. All rights reserved.
 */
