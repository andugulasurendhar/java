package com.example.helloworld;
import com.example.helloworld.ListNode;

import java.util.List;
import java.util.*;
import java.io.*;

public class ReveseOfLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode();

        head.val = 1;
        ListNode x = new ListNode();
        x.val = 2;
        head.next = x;
        ListNode x1 = new ListNode();
        x1.val = 3;
        x.next = x1;
        ListNode x2 = new ListNode();
        x2.val = 4;
        x1.next = x2;
       ListNode res =  reverseList(head);
        while(res !=null){
            System.out.println(res.val);
            res = res.next;
        }
    }


    // Definition for singly-linked list.
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
