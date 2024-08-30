package NeetCode150_ProblemSolving;

public class MergeKSortedLists0023 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length < 1) {
            return null;
        }

        int interval = 1;
        final int LIST_SIZE = lists.length;
        while (interval < LIST_SIZE) {
            for (int i = 0; i < LIST_SIZE - interval; i += 2 * interval) {
                lists[i] = mergeTwoLists(lists[i], lists[i + interval]);
            }
            interval *= 2;
        }

        return lists[0];
    }

    public ListNode mergeTwoLists(ListNode first, ListNode second) {
        ListNode result = new ListNode(-1);
        ListNode curr = result;

        while (first != null && second != null) {
            if (first.val <= second.val) {
                curr.next = first;
                first = first.next;
            } else {
                curr.next = second;
                second = second.next;
            }
            curr = curr.next;
        }

        if (first != null) {
            curr.next = first;
        } else if (second != null) {
            curr.next = second;
        }

        return result.next;
    }

    public static void main(String[] args) {
    }
}
