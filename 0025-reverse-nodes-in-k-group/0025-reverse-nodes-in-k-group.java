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
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k == 1){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevgrp = dummy;
        
        while(true){
            ListNode Kth = prevgrp;

            for(int i=0;i<k && Kth != null;i++){
                Kth = Kth.next;
            }

            if(Kth == null){
                break;
            }

            ListNode grpnext = Kth.next;

            ListNode prev = grpnext;
            ListNode curr = prevgrp.next;

            while(curr != grpnext){
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            ListNode temp = prevgrp.next;
            prevgrp.next = Kth;
            prevgrp = temp;
        }
        return dummy.next;
    }
}