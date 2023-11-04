class ListNode4 {
    int val;
    ListNode4 next;
    ListNode4(int x) {
        val = x;
    }
}
public class ListMerging {
    public static void main(String[] args) {

    }

    public static ListNode4 mergeSortedList(ListNode4 l1, ListNode4 l2) {
        ListNode4 dummy = new ListNode4(0);
        ListNode4 tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            }
            tail = tail.next;
        }

        if (l1 != null) {
            tail.next = l1;
        } else {
            tail.next = l2;
        }

        return dummy.next;
    }
}
