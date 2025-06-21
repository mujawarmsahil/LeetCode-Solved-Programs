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

class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> first_number = new Stack<>();
        Stack<Integer> second_number = new Stack<>();

        // Push all values from l1 into first_number stack
        while (l1 != null) {
            first_number.push(l1.val);
            l1 = l1.next;
        }

        // Push all values from l2 into second_number stack
        while (l2 != null) {
            second_number.push(l2.val);
            l2 = l2.next;
        }

        ListNode resultingNode = null;
        int carry = 0;

        // Perform addition using the two stacks
        while (!first_number.isEmpty() || !second_number.isEmpty()) {
            if (!first_number.isEmpty()) carry += first_number.pop();
            if (!second_number.isEmpty()) carry += second_number.pop();

            // Create a new node with the digit result
            int resulting_number = carry % 10;
            carry /= 10;

            // Prepend new node to the result list
            resultingNode = new ListNode(resulting_number, resultingNode);
        }

        // If carry is left at the end, add a new node at the front
        if (carry != 0) {
            resultingNode = new ListNode(carry, resultingNode);
        }

        return resultingNode;
    }
}
