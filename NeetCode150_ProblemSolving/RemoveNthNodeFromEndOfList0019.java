package NeetCode150_ProblemSolving;

public class RemoveNthNodeFromEndOfList0019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode left = dummy;
        ListNode right = head;

        // Shift right ptr ahead by n places in beginning
        while (n > 0) {
            right = right.next;
            n--;
        }

        while (right != null) {
            left = left.next;
            right = right.next;
        }

        // Remove by fixing next ptr
        left.next = left.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
    }
}
