/* 
 * Day 1: Let and Const
 * Link: https://www.hackerrank.com/challenges/js10-let-and-const/
 * Difficulty: Easy 
 * Language Used: JavaScript
 * 
 */

// Solution: 
function main() {
    // Write your code here. Read input using 'readLine()' and print output using 'console.log()'.
    const PI = Math.PI
    const r = parseFloat(readLine())
    
    // Print the area of the circle:
    const area = PI * r * r
    console.log(area)
    // Print the perimeter of the circle:
    const perimeter = 2 * PI * r
    console.log(perimeter)

    try {    
        // Attempt to redefine the value of constant variable PI
        PI = 0;
        // Attempt to print the value of PI
        console.log(PI);
    } catch(error) {
        console.error("You correctly declared 'PI' as a constant.");
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
