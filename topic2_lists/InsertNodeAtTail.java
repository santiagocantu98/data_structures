// SpaniardsToSv. Please report an issue if you have any questions.

// HackerRank documentation.
/*
  Insert Node at the end of a linked list
  head pointer input could be NULL as well for empty list
  Node is defined as
*/ 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


  class Node {
     int data;
     Node next;
     
     public Node(int data) {
         this.data = data;
         this.next = null;   
     }
  }
  
  class LinkedList {
      Node head;
      
      public void append(int data) {
         if (head == null) {
            head = new Node(data);
            return;
         }
         Node current = head;
         while (current.next != null) {
            current = current.next;
         }
         current.next = new Node(data);
      }
      
      public void print() {
         if (head == null) {
            System.out.println(head);
            return;
         }
         Node current = head;
         while (current != null) {
            System.out.println(current.data);
            current = current.next;
         }
      }
  }
  
  
  class principal {
      public static void main(String args[]){
         Scanner in = new Scanner(System.in);
         LinkedList l1 = new LinkedList();
         int n = in.nextInt();
         int data;
         for (int i = 0; i < n; i++) {
            data = in.nextInt();
            l1.append(data);
         }
         l1.print();
         
      }
  }
  
  


/**
* Our solution. Please note that there could always be more than one.
*

Node Insert(Node head,int data) {
    Node tail = new Node();
    tail.data = data;
    if (head == null) {
        return tail;
    }

    Node trackingNode = head;

    while (trackingNode.next != null) {
        trackingNode = trackingNode.next;
    }
    trackingNode.next = tail;
    return head;
}
*/