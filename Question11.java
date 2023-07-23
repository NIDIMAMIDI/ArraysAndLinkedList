/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.*;
class Solution {
    public ListNode swapPairs(ListNode head) {
        // Handles the case where head is null or contains only one node
        if (head == null || head.next == null) {
            return head;
        }

        // Declare a new node dummy
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // Check for even length 
        while (head != null && head.next != null) {
            // Make 2 nodes first and second
            ListNode first = head;
            ListNode second = head.next;

            // Swapping nodes
            prev.next = second;
            first.next = second.next;
            second.next = first;

            // Increment the pointers
            prev = first;
            head = first.next;
        }

        // return the head
        return dummy.next;
    }
}