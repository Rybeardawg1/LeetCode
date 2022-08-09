import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        RotateArray start = new RotateArray();
        int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        start.rotate(nums, 3);
    }

    public void rotate(int[] nums, int k) {
        int len = nums.length;
        if (k > len)
            k = len % k;
        for(int i = 0; i < len - k; i++) {
            int temp = nums[i + k];
            nums[i + k] = nums[i];
            nums[i] = temp;
        }
        // for(int i = k; i < len - 1; i++) {
        //     int temp = nums[i];
        //     nums[i] = nums[i + 1];
        //     nums[i + 1] = temp;
        // }
        System.out.println(Arrays.toString(nums));
    }
}