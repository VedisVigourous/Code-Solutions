/* 
 * Day 8: Dictionaries and Maps
 * Link: https://www.hackerrank.com/challenges/30-dictionaries-and-maps
 * Difficulty: Easy 
 * Language Used: Java 15
 * 
 */

// Solution: 
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner input = new Scanner(System.in);
        
        int noOfEntries = input.nextInt();
        
        // Creation of a PhoneBook         
        Map<String , Long> phoneBook = new HashMap<>();
        
        // Adding entries to PhoneBook using .put() function
        for(int entries = 0; entries < noOfEntries ; entries++){
            String name = input.next();
            Long contact = input.nextLong();
            
            phoneBook.put(name, contact);
        }
        
        //Finding of Key-Value Pairs
        while(input.hasNext()){
            String findName = input.next();
            
            if(phoneBook.get(findName) != null ) {
                System.out.println(findName + "=" + phoneBook.get(findName));
            }
            else {
                System.out.println("Not found");
            }
        }
    }
}


// ================================================================================== //

/* -- Explanation: Create a phone book using a HashMap and query it for contact information.
   
   -- Logic used: 
      1. Read the number of entries to add to the phone book
      2. Create a HashMap to store name-contact pairs
      3. Read name and phone number pairs and add them to the HashMap
      4. Query the phone book for names and print the contact or "Not found"
   
   -- Loop uses:
      1. For loop (entries): Iterates from 0 to noOfEntries
         - Reads a name and contact number for each iteration
         - Uses phoneBook.put() to add the entry to the HashMap
      
      2. While loop (input.hasNext()): Continues while there is input to read
         - Reads a name to search for
         - Uses phoneBook.get() to check if the name exists
         - Prints "name=contact" if found, otherwise prints "Not found"
      
   -- Key Points:
      - HashMap is used for efficient key-value pair storage and retrieval
      - Map.put() adds entries to the phone book
      - Map.get() returns the value (contact) or null if key (name) doesn't exist
      - The output format is strictly "name=contact" when found
*/

// =================================================================================== //

/* By: Vadanta Kumar Chauhaan
 * HackerRank: https://www.hackerrank.com/profile/codegrounds666
 * GitHub: https://github.com/VedisVigourous
 * Contact vadanta592007@hotmail.com
 */