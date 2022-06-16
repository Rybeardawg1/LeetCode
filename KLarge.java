public class KLarge {
    public static void main(String[] args) {
        int[] nums = new int[] { 4, 5, 8, 2 };
        KthLargest kthLargest = new KthLargest(3, nums);
        System.out.println(kthLargest.add(3)); // return 4
        System.out.println(kthLargest.add(5)); // return 5
        System.out.println(kthLargest.add(10)); // return 5
        System.out.println(kthLargest.add(9)); // return 8
        System.out.println(kthLargest.add(4)); // return 8
    }
}