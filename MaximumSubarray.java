import java.util.Arrays;

public class MaximumSubarray {
    public static void main(String[]args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        /*//reading left to right of the array checking if the sum gets larger
        int maxSubArray = nums[0];
        int currentSum = 0;

        for(int i : nums) {
            if(currentSum < 0) {
                currentSum = 0;
            }
            currentSum += i;
            maxSubArray = Math.max(maxSubArray, currentSum);
        }
        return maxSubArray;*/
        
        // conquer and divide method isn't working but its possible 
        if(nums.length == 1) {
            return Arrays.stream(nums).sum();
        }
        int[] firstHalf = Arrays.copyOfRange(nums, 0, nums.length/2);
        int[] secondHalf = Arrays.copyOfRange(nums, nums.length/2, nums.length);

        int max = Math.max(Math.max(maxSubArray(firstHalf),  maxSubArray(secondHalf)), Arrays.stream(nums).sum());
        return max;
    }
}