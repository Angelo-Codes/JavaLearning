import java.util.Stack;

class ListNode5 {
    int val;
    ListNode5 next;
    ListNode5(int x) {
        val = x;
    }
}
public class LinkedListPalindromeChecker {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(ListNode5 head) {
        Stack<Integer> stack = new Stack<>();
        ListNode5 current = head;

        while (current != null) {
            if (current.val != stack.pop()) {
                return false;
            }
            current = current.next;
        }
        return true;
    }
}
