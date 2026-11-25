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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) {
            return head;
        }
        int n =0;
        ListNode dummy = head;
        while(dummy != null) {
            n++;
            dummy = dummy.next;
        }

        k = k % n;

        for(int i=0;i<k;i++){
            dummy =head;
            ListNode prev = null;
            while(dummy.next != null){
                prev = dummy;
                dummy = dummy.next;
            }
            dummy.next = head;
            prev.next = null;
            head = dummy;
    
        }

        return head;
    }
}