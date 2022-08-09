import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        RemoveDuplicatesfromSortedArray start = new RemoveDuplicatesfromSortedArray();
        int[] nums = new int[] { 6, 6, 7, 7, 7, 8, 8, 9, 9, 10};
        System.out.println(start.removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (i == 0 || n > nums[i - 1]) {
                nums[i++] = n;
            }
        }
        return i;
    }
}