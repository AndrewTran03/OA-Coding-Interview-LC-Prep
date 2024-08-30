package NeetCode150_ProblemSolving;

import java.util.*;

public class CopyListWithRandomPointer0138 {
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

    public Node copyRandomList(Node head) {
        Map<Node, Node> nodeRefs = new HashMap<>();
        
        // Set the 'val' field of the current Node copy
        Node curr = head;
        while (curr != null) {
            nodeRefs.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        // Set the 'next' and 'random' fields of the current Node copy
        curr = head;
        while (curr != null) {
            Node temp = nodeRefs.get(curr);
            temp.next = nodeRefs.get(curr.next);
            temp.random = nodeRefs.get(curr.random);
            curr = curr.next;
        }

        return nodeRefs.get(head);   
    }

    public static void main(String[] args) {
    }
}
