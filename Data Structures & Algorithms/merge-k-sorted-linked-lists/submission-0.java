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
    public ListNode mergeKLists(ListNode[] lists) {

        ListNode dummy = new ListNode();
        ListNode current = dummy;
   
        while(true) {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for(int i = 0; i < lists.length; i++) {
                ListNode head = lists[i];
                if(head == null) {
                    continue;
                }
                if(head.val < min) {
                    min = head.val;
                    minIndex = i;
                }

             }
             if(minIndex == -1) {
                break;
             }
            current.next = lists[minIndex];
            lists[minIndex] = lists[minIndex].next;
            current = current.next;

        }
  
        return dummy.next;

    }
}
