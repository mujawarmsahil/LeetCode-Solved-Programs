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
class ModifiedList {
    public ListNode modifiedList(int[] nums, ListNode head) {
        // Step 1: Store all nums in a HashSet for O(1) lookup
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // Step 2: Create a dummy node before head 
        // (handles edge case when head itself should be removed)
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // prev points to the last valid node in the result list
        // curr is used to iterate over the linked list
        ListNode prev = dummy;
        ListNode curr = head;

        // Step 3: Traverse the linked list
        while (curr != null) {
            if (set.contains(curr.val)) {
                // If curr.val is in nums → skip this node
                prev.next = curr.next;
            } else {
                // Otherwise, move prev forward
                prev = curr;
            }
            // Always move curr forward
            curr = curr.next;
        }

        // Step 4: Return the new head (dummy.next)
        return dummy.next;
    }
}
