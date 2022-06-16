public class ReverseLinkedList {

    public static void main(String[]args) {
        ReverseLinkedList start = new ReverseLinkedList();
        ListNode next3 = new ListNode(5, null);
        ListNode next2 = new ListNode(4, next3);
        ListNode next1 = new ListNode(3, next2);
        ListNode next = new ListNode(2, next1);
        ListNode head = new ListNode(1, next);
        ListNode.printer(start.reverseList(head));
    }

    public ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }

    public ListNode reverse(ListNode head, ListNode newHead) {
        if (head == null)
            return newHead;
        ListNode next = head.next;
        head.next = newHead;
        return reverse(next, head);
    }
}