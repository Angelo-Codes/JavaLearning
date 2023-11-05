class ListNode3 {
    int val;
    ListNode3 next;
    ListNode3(int x) {
        val = x;
    }
}

public class LInkenListReversion {
    public static void main(String[] args) {
    }
    public ListNode3 reverseList(ListNode3 head) {
        ListNode3 prev = null;
        ListNode3 curr = prev;

        while (curr != null) {
            ListNode3 nextTemp = curr.next;
            curr.next = prev;
            curr = nextTemp;
        }

        return prev;
    }
}
