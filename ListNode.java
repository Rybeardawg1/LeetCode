public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    static void printer(ListNode head) {
        if(head == null) {
            return;
        }  
        System.out.print(head.val + "\t");
        printer(head.next);
    }
}