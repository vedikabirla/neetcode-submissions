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
    public ListNode removeNthFromEnd(ListNode head, int n) {
  ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode rightPointer = dummy;
        ListNode leftPointer = dummy;
        
     
       
        //1,2 --> n = 2;
        for(int count = 1; count <= n; count++) {
            rightPointer = rightPointer.next;
          
        }
  
        while(rightPointer.next != null) {
            leftPointer = leftPointer.next;
            rightPointer = rightPointer.next;
          

        }
   
       leftPointer.next = leftPointer.next.next;

        return dummy.next;
        

    }
}
