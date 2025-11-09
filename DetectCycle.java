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
public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        // Using a HashMap to store visited nodes. 
        // Key is the node's identity (using toString() gives its memory-like identity in Java),
        // Value is the node itself.
        Map<String, ListNode> listNodeMap = new HashMap<>();

        // Traverse the linked list
        while (head != null) {

            // If we have already seen this node, a cycle exists
            if (listNodeMap.containsKey(head.toString())) {
                return head;    // This is the start of the cycle
            }

            // Mark this node as visited
            listNodeMap.put(head.toString(), head);

            // Move to the next node
            head = head.next;
        }

        // If traversal ends, there is no cycle
        return null;
    }
}
