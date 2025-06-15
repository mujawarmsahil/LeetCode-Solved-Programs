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

class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        // Dummy node to start the result list
        ListNode resultant = new ListNode();
        ListNode head = resultant;

        while (true) {
            // Placeholder for the minimum node in this iteration
            ListNode node = new ListNode(Integer.MAX_VALUE);
            int moving_index = -1;

            // Find the node with the smallest value among the current list heads
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null && node.val > lists[i].val) {
                    node = lists[i];
                    moving_index = i;  // Store the index of the list with the smallest node
                }
            }

            // If we found a node, append it to the result and move the pointer in that list
            if (moving_index != -1) {
                resultant.next = node;
                resultant = resultant.next;
                lists[moving_index] = lists[moving_index].next;  // Move to next node in the chosen list
            } else {
                // All lists are exhausted
                break;
            }
        }

        return head.next;  // Return the actual merged list (skip dummy head)
    }
}
