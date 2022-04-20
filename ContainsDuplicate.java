import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[]args) {
        
        int[] nums = new int[]{1, 2, 3, 4, 5};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        // using hashset, we can minimize the time comp. since contains() is O(1)
        HashSet<Integer> count = new HashSet<Integer>(nums.length);
        for(int i : nums) {
            if(count.contains(i)) {
                return true;
            }
            count.add(i);
        }
        return false;

        /* It works but its in nlogn :/
        Arrays.sort(nums);
        int length = nums.length - 1;

        for(int i = 0; i < length; i++) {
            if(nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;*/

        /* Only considers positive numbers :/
        int max = nums[0];
        for(int i = 0; i < nums.length; i++) {
            if(max < nums[i]) {
                max = nums[i];
            }
        }        
        int[] count = new int[++max];
        
        for(int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
            if(count[nums[i]] > 1) {
                return true;
            }
        }
        return false;
        */
    }
}