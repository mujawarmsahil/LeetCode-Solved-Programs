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
class ReverseList {
    public ListNode reverseList(ListNode head) {
        // Initialize previous node as null (this will be the new tail of the list)
        ListNode prev = null;
        
        // Start with the head node
        ListNode curr = head;

        // Traverse the linked list
        while (curr != null) {
            // Store the next node before breaking the link
            ListNode next = curr.next;
            
            // Reverse the link: point current node to the previous node
            curr.next = prev;
            
            // Move prev and curr one step forward
            prev = curr;
            curr = next;
        }

        // Return prev, which is now the new head of the reversed list
        return prev;
    }
}
