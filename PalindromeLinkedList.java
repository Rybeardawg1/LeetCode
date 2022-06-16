import java.util.List;

public class PalindromeLinkedList {

    public static void main(String[] args) {
        PalindromeLinkedList start = new PalindromeLinkedList();
        ListNode next3 = new ListNode(1, null);
        ListNode next2 = new ListNode(1, null);
        ListNode next1 = new ListNode(2, next2);
        ListNode next = new ListNode(2, null);
        ListNode head = new ListNode(1, next);
        System.out.println(start.isPalindrome(head));
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = head;
        slow = reverse(slow, null);
        while(fast != null && slow != null) {
            if(fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    public ListNode reverse(ListNode root, ListNode head) {
        if(root == null) {
            return head;
        }
        ListNode next = root.next;
        root.next = head;
        return reverse(next, root);
    }

    // public boolean isPalindrome(ListNode head) {
    //     String s = Store(head, "");
    //     char[] c = s.toCharArray();
    //     for (int i = 0, j = c.length - 1; i < j;) {
    //         if (c[i] != c[j])
    //             return false;
    //         i++;
    //         j--;
    //     }
    //     return true;
    // }

    // public String Store(ListNode head, String nums) {
    //     if (head == null)
    //         return nums;
    //     nums = nums + head.val;
    //     nums = Store(head.next, nums);
    //     return nums;
    // }

}