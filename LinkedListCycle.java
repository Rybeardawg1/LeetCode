public class LinkedListCycle {

    public static void main(String[] args) {
        LinkedListCycle start = new LinkedListCycle();
        ListNode next3 = new ListNode(5, null);
        ListNode next2 = new ListNode(-4, null);
        ListNode next1 = new ListNode(0, next2);
        ListNode next = new ListNode(2, next1);
        ListNode head = new ListNode(3, next);
        next2 = new ListNode(-4, head);
        System.out.println(start.hasCycle(head));
    }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast)
                return true;
        }
        return false;
    } 
}