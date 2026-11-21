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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list1Current = list1;
        ListNode list2Current = list2;
        ListNode mergedHead = new ListNode();
        ListNode currentMerged = mergedHead;
        while(list1Current != null || list2Current != null) {
            ListNode newNode = new ListNode();
            if(list1Current == null) {
                newNode.val = list2Current.val;
                list2Current = list2Current.next;
            } else if(list2Current == null) {
                newNode.val = list1Current.val;
                list1Current = list1Current.next;
            } else if(list1Current.val <= list2Current.val) {
             newNode.val = list1Current.val;
             list1Current = list1Current.next;
           } else {
             newNode.val = list2Current.val;
             list2Current = list2Current.next;

           }
           currentMerged.next = newNode;
           currentMerged = newNode;
        }
        return mergedHead.next;


        
    }
}