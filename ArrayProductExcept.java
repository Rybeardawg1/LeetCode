import java.util.*;

public class ArrayProductExcept {
    public static void main(String[]args) {
        
        int[] nums = new int[]{1, 2, 3, 4};

        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    
    public static int[] productExceptSelf(int[] nums) {

        int[] products = new int[nums.length];

        int prefix = 1;
        for(int i = 0; i < nums.length; i++) {
            products[i] = prefix;
            prefix *= nums[i];
        }
        int postfix = 1;
        for(int i = nums.length-1; i > -1; i--) {
            products[i] *= postfix;
            postfix *= nums[i];
        }
        return products;

        /* times out on LeetCode b/c its O(n^2) or something
        int[] products = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            products[i] = 1;
        } 
        for(int i = 0; i < nums.length; i++) {
            for(int z = 0; z < nums.length; z++) {
                if(z != i) {
                    products[i] *= nums[z];
                }
            }
        }
        return products;*/
    }
}