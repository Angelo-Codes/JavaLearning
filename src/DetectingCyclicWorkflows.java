import java.util.HashSet;

class ListNode6 {
    int val;
    ListNode6 next;
    ListNode6(int x) {
        val = x;
    }
}
public class DetectingCyclicWorkflows {
    public static void main(String[] args) {

    }

    public static boolean hasCycle(ListNode6 head) {
        HashSet<ListNode6> visitedNotes = new HashSet<>();
        ListNode6 curr = head;

        while (curr != null) {
            if (visitedNotes.contains(curr)) {
                return true;
            }
            visitedNotes.add(curr);
            curr = curr.next;
        }
        return false;
    }
}
