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
class GetDecimalValue {
    public int getDecimalValue(ListNode head) {
        ArrayList<Integer> binaryList = new ArrayList<>(); // Stores binary digits in order

        ListNode temp = head;

        // Traverse the linked list and store values in the list
        while (temp != null) {
            binaryList.add(temp.val);
            temp = temp.next;
        }
        
        int power = binaryList.size() - 1;  // Start from highest power of 2
        double returningNumber = 0;

        // Convert binary to decimal
        for (int binary : binaryList) {
            returningNumber += Math.pow(2, power--) * binary;
        }

        return (int) (returningNumber); // Cast to int as the result is a whole number
    }
}
