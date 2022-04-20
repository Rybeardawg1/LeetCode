import java.util.*;

public class MaximumProductSubarray {
    public static void main(String[]args) {
        int[] nums = new int[]{1,0,-1,2,3,-5,-2};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int res = Arrays.stream(nums).max().getAsInt();;
        int min = 1;
        int max = 1;
        
        for(int i : nums) {
            if(i == 0) {
                min = 1;
                max = 1;
            }
            int temp = max*i;
            max = Math.max(i*max, i*min);
            min = Math.min(Math.min(temp, i*min), i);
            res = Math.max(res, max);
        }
        return res;

        /*brute force method, O(n^2)
        int bestProduct = nums[0];
        for(int i = 0; i < nums.length; i++) {
            int temp1 = 1;
            for(int z = i; z < nums.length; z++) {
                temp1 *= nums[z];
                if(temp1 > bestProduct) {
                    bestProduct = temp1;
                }
            }
        }
        return bestProduct;*/
    }
}