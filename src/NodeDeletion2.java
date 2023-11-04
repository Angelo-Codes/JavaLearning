class ListNode2 {
    int val;
    ListNode2 next;
    ListNode2(int x) {
        val = x;
    }
}

public class NodeDeletion2 {
    public static void main(String[] args) {
        removeNthFromEnd();
    }
    public static ListNode2 removeNthFromEnd(ListNode2 head, int n) {
        ListNode2 dummy = new ListNode2(0);
        dummy.next = head;
        ListNode2 first = dummy;
        ListNode2 second = dummy;

        for (int i = 1; i < n; i++) {
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;
        return dummy.next;
    }
}
