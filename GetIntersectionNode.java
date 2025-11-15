public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Set to store all nodes of List A
        HashSet<ListNode> visited = new HashSet<>();

        // Traverse List A and add every node to the set
        while (headA != null) {
            visited.add(headA);
            headA = headA.next;
        }

        // Traverse List B and check if any node is already in the set
        while (headB != null) {
            if (visited.contains(headB)) {
                return headB; // Intersection found
            }
            headB = headB.next;
        }

        // No intersection found
        return null;
    }
}
