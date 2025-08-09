/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        // If the list is empty or has only one node, it can't have a cycle
        if (head == null || head.next == null) {
            return false;
        }

        // Slow pointer moves one step at a time
        ListNode slow = head;
        // Fast pointer moves two steps at a time
        ListNode fast = head;

        // Loop until fast pointer reaches end (no cycle) or slow meets fast (cycle exists)
        while (fast != null && fast.next != null) {
            slow = slow.next;           // Move one step
            fast = fast.next.next;      // Move two steps

            // If both meet, cycle detected
            if (slow == fast) {
                return true;
            }
        }

        // If we exit loop, there is no cycle
        return false;
    }
}
