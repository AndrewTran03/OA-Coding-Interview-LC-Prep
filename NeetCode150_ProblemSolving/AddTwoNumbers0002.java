package NeetCode150_ProblemSolving;

public class AddTwoNumbers0002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode curr = result;

        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            sum = sum % 10;
            
            curr.next = new ListNode(sum);
            curr = curr.next;
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        return result.next;
    }

    public static void main(String[] args) {
    }
}
