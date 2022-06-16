import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch start = new BinarySearch();
        int[] nums = new int[] { -1, 0, 1, 2, 3, 4, 5, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21 };
        System.out.println(start.search(nums, 21));
    }

    public int search(int[] nums, int target) {
            int bottom = 0;
        int mid = nums.length / 2;
        int top = nums.length - 1;
        while (top - bottom <= 2) {
            if (target == nums[mid]) {
                return mid;
            } else if (target == nums[bottom]) {
                return bottom;
            } else if (target == nums[top]) {
                return top;
            } else if (target > nums[mid]) {
                bottom = mid;
                mid = (top - mid) / 2 + mid;
            } else {
                top = mid;
                mid = (top - bottom) / 2 + bottom;
            }
        }
        return -1;
    }
}