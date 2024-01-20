class Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
           if (head == null || head.next == null) {
            return head;
        }

        ListNode nextNode = head.next;
        head.next = null; // Break the link to the next node
        ListNode reversedRest = reverseList(nextNode);
        nextNode.next = head;

        return reversedRest;
    }
}