public class MergeTwoSortedLists {

    public static void main(String[] args) {
        MergeTwoSortedLists start = new MergeTwoSortedLists();
        ListNode list1_3 = new ListNode(4, null);
        ListNode list1_2 = new ListNode(2, list1_3);
        ListNode list1 = new ListNode(1, list1_2);
        ListNode list2_3 = new ListNode(4, null);
        ListNode list2_2 = new ListNode(3, list2_3);
        ListNode list2 = new ListNode(1, list2_2);
        ListNode.printer(start.mergeTwoLists(list1, list2));
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode combined;
        if (list1 == null && list2 == null) {
            return null;
        } else if (list1 == null) {
            combined = list2;
        } else if (list2 == null) {
            combined = list1;
        } else if (list1.val > list2.val) {
            combined = list2;
            merge(combined, list1, list2.next);
        } else {
            combined = list1;
            merge(combined, list1.next, list2);
        }
        return combined;
    }

    public ListNode merge(ListNode combined, ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        } else if (list1.val > list2.val) {
            combined.next = list2;
            merge(combined.next, list1, list2.next);
        } else {
            combined.next = list1;
            merge(combined.next, list1.next, list2);
        }
        return combined;
    }
}