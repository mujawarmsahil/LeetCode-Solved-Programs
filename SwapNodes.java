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
class SwapNodes {
    public ListNode swapNodes(ListNode head, int k) {
        // Step 1: Determine the size of the linked list
        int size = 1; 
        ListNode temp = head;
        while (temp.next != null) {
            size++;  // Counting the number of nodes
            temp = temp.next;
        }

        // Step 2: Find the k-th node from the beginning
        ListNode first = head;
        ListNode second = head;
        int i = 1;
        while (i < k) {  // Move 'first' to the k-th node
            first = first.next;
            i++;
        }

        // Step 3: Find the k-th node from the end (size - k + 1)
        i = 1;
        while (i < size - k + 1) {  // Move 'second' to the (size-k+1)-th node
            second = second.next;
            i++;
        }

        // Step 4: Swap the values of the two nodes
        int val = first.val;
        first.val = second.val;
        second.val = val;

        return head; // Return the modified linked list
    }
}
