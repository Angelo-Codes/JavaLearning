import java.util.LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
public class NodeDeletion {
    public static void main(String[] args) {
        NodeDeletion sll = new NodeDeletion();
    }
    public static ListNode deleteNode(ListNode node,ListNode head) {
        if (node == head) {
            return head.next;
        }
        ListNode prev = head;
        while (prev.next != node) {
            prev = prev.next;
        }
        prev.next = node.next;
        return head;
    }
}
/*Input:
        node = 2 -> 3 -> 4;
        head = 1 -> 2 -> 3 -> 4 -> 5;

    Your startup has built a linked list to store important client and financial data.
    However, sometimes you may need to delete a node in this list due to data being
    outdated or irrelevant. Write a function that given a node in the list and the
    list head, deletes that node in an efficient manner and returns the updated list.

    Explanation:

    The function takes in two parameters, the node to be deleted and the head of the linked list.
    The function should delete the given node and return the updated linked list. In the first example,
     the node to be deleted is 3 -> 4 -> 5 and the head of the linked list is 1 -> 2 -> 3 -> 4 -> 5.
     After deleting the node, the updated linked list should be 1 -> 2 -> 4 -> 5. In the second example,
     the node to be deleted is 2 -> 3 -> 4 and the head of the linked list is 1 -> 2 -> 3 -> 4 -> 5.
    After deleting the node, the updated linked list should be 1 -> 4 -> 5.

     Since we are given the node to be deleted, we don't need to traverse the entire linked list
      to find it. We can simply remove the node by copying the data from the next node into the
       current node and then deleting the next node.

    However, if the node to be deleted is the last node in the linked list, we cannot follow
    the above approach. In this case, we need to traverse the linked list until we find the
    node whose next node is the node to be deleted.

    Make sure to handle the case where the node to be deleted is the head of the linked list
    separately.

    Don't forget to update the head of the linked list if the node to be deleted is the head.

    Finally, return the head of the updated linked list.

step by steps:

        The method starts by checking if the node to be deleted is the head of the linked list. If it is, it means we need to delete the first node, so we simply return the reference to the next node (head.next). This effectively removes the first node and makes the next node the new head of the list.

    If the node is not the head, we need to find its previous node to properly delete it. We start by initializing a variable prev with the value of the head node.

    We then enter a loop that iterates until we find the node just before the node we want to delete. In each iteration, we move prev to the next node in the list by assigning prev.next to prev. This continues until prev.next is equal to the node we want to delete.

    Once we find the previous node (prev), we update its next reference to skip over the node we want to delete. We do this by assigning node.next to prev.next, effectively bypassing the node and linking the previous node directly to the next node.

    Finally, we return the head of the linked list. If the node to be deleted was the head, the new head will be the next node (head.next). Otherwise, the head remains unchanged.
*/
