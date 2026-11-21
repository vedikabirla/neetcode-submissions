/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Node newHead = new Node(head.val);
        Node currentNewList = newHead;
        Node oldList = head;
        HashMap<Node,Node> map = new HashMap<>();
        map.put(head, newHead);
        while(oldList.next != null) {
            Node nextNode = oldList.next;
            Node newNode = new Node(nextNode.val);
            map.put(nextNode, newNode);
            currentNewList.next = newNode;
            currentNewList = newNode;
            oldList = oldList.next;
        }
        currentNewList = newHead;
        oldList = head;
        while(oldList != null) {
            Node random = oldList.random;
            if(random != null) {
             currentNewList.random = map.get(random);
            } else {
                currentNewList.random = null;
            }
            oldList = oldList.next;
            currentNewList = currentNewList.next;

        }
        return newHead;
        
    }
}
