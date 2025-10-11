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

class OddEvenList {
    public static ListNode oddEvenList(ListNode head) {
        // If list is empty or has only one node, no change is needed
        if (head == null || head.next == null) return head;

        // oddHead → first node (odd list)
        // evenHead → second node (even list)
        ListNode oddHead = head;
        ListNode evenHead = head.next;

        // Pointers to traverse and rearrange the list
        ListNode odd = oddHead;
        ListNode even = evenHead;

        // Traverse until there are no more even nodes or next of even nodes
        while (even != null && even.next != null) {
            // Connect current odd node to next odd node (skip even)
            odd.next = even.next;
            odd = odd.next;  // move odd pointer ahead

            // Connect current even node to next even node (skip odd)
            even.next = odd.next;
            even = even.next; // move even pointer ahead
        }

        // After loop, all odd nodes are connected together
        // and all even nodes are connected together.
        // Now link the end of odd list to start of even list
        odd.next = evenHead;

        // Return the head of the rearranged list (oddHead remains start)
        return oddHead;
    }
}
