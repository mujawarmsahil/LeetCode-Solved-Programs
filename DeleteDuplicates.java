class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;

        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next; // Skip duplicate node
            } else {
                temp = temp.next; // Move to the next distinct node
            }
        }
        
        return head;
    }
}
