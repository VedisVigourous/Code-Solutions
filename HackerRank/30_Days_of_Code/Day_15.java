

/* 
 * Day 15: Linked List
 * Link: https://www.hackerrank.com/challenges/30-linked-list 
 * Difficulty: Easy
 * Language Used: Java 8
 *
 */

import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}


class Solution {

    public static  Node insert(Node head,int data) {
        Node node = new Node(data);
        
        if(head == null){
            return node;
        }
        
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        
        return head;
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}

/*
Step-by-step explanation:
1) insert(head, data) creates a new node with the given data.
2) If head is null, the list is empty, so return the new node as head.
3) Otherwise, start from head and move temp until temp.next becomes null.
4) Attach the new node at the end using temp.next = node.
5) Return head so main keeps the correct list start.

Visualization (example input: 2 3 4 1):
Start: head = null
Insert 2: head -> [2|null]
Insert 3: head -> [2|*] -> [3|null]
Insert 4: head -> [2|*] -> [3|*] -> [4|null]
Insert 1: head -> [2|*] -> [3|*] -> [4|*] -> [1|null]
Output: 2 3 4 1

Note: Head always points to the first value only as head is not manipulated after the first insert. We only manipulate temp to find the end of the list and attach new nodes there. and return the initial head to main so it can keep track of the list start. */



/*
 * Author: Vadanta Kumar Chauhaan
 * HackerRank: https://www.hackerrank.com/profile/codegrounds666
 * GitHub: https://github.com/VedisVigourous
 * LinkedIn: https://www.linkedin.com/in/vadanta
 * Contact: vadanta592007@hotmail.com
 * Copyright (c) 2026 Vadanta Kumar Chauhaan. All rights reserved.
 */
