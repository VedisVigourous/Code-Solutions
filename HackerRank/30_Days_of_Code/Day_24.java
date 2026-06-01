

/* 
 * Day 24: More Linked Lists
 * Link: https://www.hackerrank.com/challenges/30-linked-list-deletion
 * Difficulty: Easy
 * Language Used: Java 8
 *
 */

public static Node removeDuplicates(Node head) {
    if(head == null){
        return head;
    }  
      
    Node temp = head;
    while(temp!= null && temp.next !=null){
        if(temp.next.data == temp.data){
            temp.next = temp.next.next;
        }
        else {
            temp = temp.next;
        }
    }
    return head;
}


// Explanation: 

/* For a sorted linked list, duplicates appear consecutively.
    Iterate from the head; for each node compare its data with the next node's data.
    If they are equal, skip the next node by linking current node to next.next.
    Otherwise advance to the next node. Continue until reaching the list end.

    This preserves the first occurrence of each value and removes consecutive duplicates.
*/




/*
 * Author: Vadanta Kumar Chauhaan
 * HackerRank: https://www.hackerrank.com/profile/codegrounds666
 * GitHub: https://github.com/VedisVigourous
 * LinkedIn: https://www.linkedin.com/in/vadanta
 * Contact: vadanta592007@hotmail.com
 * Copyright (c) 2026 Vadanta Kumar Chauhaan. All rights reserved.
 */
