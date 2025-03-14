/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class RemoveElements {
    public ListNode removeElements(ListNode head, int val) {
        // Create a dummy node to handle edge cases where head needs removal
        ListNode temp = new ListNode(-1);
        temp.next = head;

        ListNode curr = head;   // Pointer to traverse the list
        ListNode prev = temp;   // Pointer to keep track of the previous valid node

        // Traverse the list
        while (curr != null) {
            if (curr.val == val) {
                // If current node contains the target value, skip it
                prev.next = curr.next;
            } else {
                // Otherwise, move prev forward
                prev = curr;
            }
            // Move curr to the next node
            curr = prev.next;
        }

        // Return the new head (skipping dummy node)
        return temp.next;
    }
}
