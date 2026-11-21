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
    public void reorderList(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode current = head;
        while(current != null) {
            list.add(current);
            current = current.next;
        }
        int leftPointer = 1;
        int rightPointer = list.size() - 1;
        ListNode newCurrent = head;
        while(leftPointer <= rightPointer) {
            newCurrent.next = list.get(rightPointer);
            newCurrent = newCurrent.next;
            rightPointer--;
            newCurrent.next = list.get(leftPointer);
            newCurrent = newCurrent.next;
            leftPointer++;
        }
        newCurrent.next = null;
   
    }
}
