

/* 
 * Day 23: BST Level-Order Traversal
 * Link: https://www.hackerrank.com/challenges/30-binary-trees
 * Difficulty: Easy
 * Language Used: Java 15
 *
 */

static void levelOrder(Node root){
      //Write your code here
      Queue<Node> qu = new LinkedList<>();
      qu.offer(root);
      
      while(!qu.isEmpty()){
            Node currentNode = qu.poll();
            System.out.print(currentNode.data + " ");
            
            if(currentNode.left != null){
                qu.offer(currentNode.left);               
            }
            if(currentNode.right != null){
                qu.offer(currentNode.right);               
            }
      }
    }


// Explanation: 

/* For the test Case Example: 
Working: 

1. offered the root = 3
2. polled it and set it as the current node
3. Added left and right child to the queue: [2 5]
4. Now polled 2 : checked for child and added to queue
5. Now polled 5 : checked for child and added to queue and so on */




/*
 * Author: Vadanta Kumar Chauhaan
 * HackerRank: https://www.hackerrank.com/profile/codegrounds666
 * GitHub: https://github.com/VedisVigourous
 * LinkedIn: https://www.linkedin.com/in/vadanta
 * Contact: vadanta592007@hotmail.com
 * Copyright (c) 2026 Vadanta Kumar Chauhaan. All rights reserved.
 */
