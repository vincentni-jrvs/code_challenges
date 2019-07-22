package ca.jrvs.challenge.freq4;

public class Reverse_Linked_List {
    /**
     * Reverse a singly linked list.
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {

        return reverse(head, null);
    }

    private ListNode reverse(ListNode head, ListNode newHead) {
        if (head == null)
            return newHead;
        ListNode next = head.next;
        head.next = newHead;
        return reverse(next, head);
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
