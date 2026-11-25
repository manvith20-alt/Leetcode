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
        if(head ==null || head.next==null){
            return head;
        }
        ArrayList<Integer> list  = new ArrayList<>();
        ListNode dummy = head;
        while(dummy != null){
            list.add(dummy.val);
            dummy = dummy.next;
        }

        for(int i = 0;i<k%list.size();i++){
            int temp = list.get(list.size()-1);
            list.remove(list.size()-1);
            list.add(0,temp);
        }
        dummy =head;

        for(int i=0;i<list.size();i++){
            dummy.val = list.get(i);
            dummy = dummy.next;
        }
        return head;
    }
}