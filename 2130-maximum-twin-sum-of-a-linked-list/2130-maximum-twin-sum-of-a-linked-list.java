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
    public int pairSum(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode dummy = head;
        int max = 0;
        while(dummy != null){
            list.add(dummy.val);
            dummy = dummy.next;
        }
        int i=0;
        int j=list.size()-1;

        while(i<j){
            max = Math.max(list.get(i)+list.get(j),max);
            i++;
            j--;
        }
        return max;
    }
}