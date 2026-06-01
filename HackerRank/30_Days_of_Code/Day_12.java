

/* 
 * Day 12: Inheritance
 * Link: https://www.hackerrank.com/challenges/30-inheritance
 * Difficulty: Easy 
 * Language Used: Java 15
 * 
 */

import java.io.*;
import java.util.*;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;
}

class Student extends Person {
    public Student(String firstName , String lastName , int idNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }
    
    public void calculate(int marks){
        if(marks <=100 && marks>= 90){
            System.out.println("Grade: O");
        }
        else if(marks<90 && marks>=80){
            System.out.println("Grade: E");
        }
        else if(marks<80 && marks>=70){
            System.out.println("Grade: A");
        }
        else if(marks<70 && marks>=55){
            System.out.println("Grade: P");
        }
        else if(marks<55 && marks>=40){
            System.out.println("Grade: D");
        }
        else if(marks < 40) {
            System.out.println("Grade: T");
        }
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName = input.next();
        String lastName = input.next();
        int idNumber = input.nextInt();
        
        
        int marks = 0;
        int testCase = input.nextInt();
        for(int i = 0; i<testCase ; i++){
            marks += input.nextInt();
        } 
        
        int avg = marks/(testCase);
        
        // Outputs
        
        Student obj = new Student(firstName, lastName, idNumber);
        
        System.out.printf("Name: %s, %s\n" , lastName , firstName);
        System.out.println("ID: " + idNumber);
        obj.calculate(avg);
    }
}

/* -- Explanation: Use inheritance to store a student's name and ID, then compute the average score and print the corresponding grade.

   -- Logic used:
      1. Read the student's personal details and all test marks
      2. Compute the average score from the input values
      3. Create a Student object from the parent Person class
      4. Print the profile details and the grade based on the average
*/



/*
 * Author: Vadanta Kumar Chauhaan
 * HackerRank: https://www.hackerrank.com/profile/codegrounds666
 * GitHub: https://github.com/VedisVigourous
 * LinkedIn: https://www.linkedin.com/in/vadanta
 * Contact: vadanta592007@hotmail.com
 * Copyright (c) 2026 Vadanta Kumar Chauhaan. All rights reserved.
 */
