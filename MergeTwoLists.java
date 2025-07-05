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
class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // \U0001f4a1 Dummy node to simplify the merging process
        ListNode sortedHead = new ListNode();
        // This keeps track of the head to return later
        ListNode returningHead = sortedHead;

        // \U0001f9e0 While both lists have nodes, compare and pick the smaller one
        while (list1 != null && list2 != null) {
            int first = list1.val;
            int second = list2.val;

            if (first < second) {
                sortedHead.next = new ListNode(first); // create new node with smaller value
                list1 = list1.next; // move list1 ahead
            } else {
                sortedHead.next = new ListNode(second);
                list2 = list2.next; // move list2 ahead
            }
            sortedHead = sortedHead.next; // move the pointer forward
        }

        // \U0001f9e0 Append any remaining nodes from list1
        while (list1 != null) {
            sortedHead.next = new ListNode(list1.val);
            sortedHead = sortedHead.next;
            list1 = list1.next;
        }

        // \U0001f9e0 Append any remaining nodes from list2
        while (list2 != null) {
            sortedHead.next = new ListNode(list2.val);
            sortedHead = sortedHead.next;
            list2 = list2.next;
        }

        // Return merged list starting from the next of dummy node
        return returningHead.next;
    }
}
