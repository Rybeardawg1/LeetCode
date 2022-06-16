import java.util.Arrays;

public class RemoveOneElementArrayStrictlyIncreasing {
    public static void main(String[] args) {
        RemoveOneElementArrayStrictlyIncreasing start = new RemoveOneElementArrayStrictlyIncreasing();
        int[] nums = new int[] { 1, 1, 1 };
        System.out.println(start.canBeIncreasing(nums));
    }

    public boolean canBeIncreasing(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] >= nums[i]) {
                int[] nums1 = new int[nums.length - 1];
                for (int j = 0; j < nums1.length; j++) {
                    if (j < i - 1) {
                        nums1[j] = nums[j];
                    } else if (j >= i - 1) {
                        nums1[j] = nums[j + 1];
                    }
                }
                int[] nums2 = new int[nums.length - 1];
                for (int j = 0; j < nums2.length; j++) {
                    if (j < i) {
                        nums2[j] = nums[j];
                    } else if (j >= i) {
                        nums2[j] = nums[j + 1];
                    }
                }
                return Increasing(nums1) || Increasing(nums2);
            }
        }
        return true;
    }

    public boolean Increasing(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] >= nums[i]) {
                return false;
            }
        }
        return true;
    }
}