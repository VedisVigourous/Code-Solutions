/* 
 * Day 4: Class vs. Instance
 * Link: https://www.hackerrank.com/challenges/30-class-vs-instance
 * Difficulty: Easy 
 * Language Used: Java 8
 * 
 */

// Solution: 
import java.io.*;
import java.util.*;

class Person {
    public int age;
    
    Person(int initialAge) {
        if(initialAge > 0) {
            this.age = initialAge;
        }
        else {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }
    
    void yearPasses(){
        this.age++;
    }
    
    void amIOld(){
        if(this.age<13){
            System.out.println("You are young.");
        }
        else if ((this.age >= 13) && (this.age < 18)){
            System.out.println("You are a teenager.");
        }
        else {
            System.out.println("You are old.");
        }
    }
}

public class Solutions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}



/* -- Explanation: Create a Person class with age validation and age categorization. Read T test cases, create Person objects, check their age category, age them 3 years, then check category again.
   -- Logic used: Constructor validates age (negative ages set to 0). yearPasses() increments age by 1. amIOld() categorizes age as "young" (<13), "teenager" (13-17), or "old" (18+) using if-else conditions. */

/* By: Vadanta Kumar Chauhaan
 * HackerRank: https://www.hackerrank.com/profile/codegrounds666
 * GitHub: https://github.com/VedisVigourous
 * Contact vadanta592007@hotmail.com
 */