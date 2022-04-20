public class FindMinimumRotatedSortedArray {
    public static void main(String[]args) {
        int[] nums = new int[]{-1, 5, 6, 7, 8, 9, 10, 15, -10, -5, -3};
        System.out.println(search(nums));
    }

    public static int search(int[] nums) {
        int l = 0, r = nums.length-1, res = nums[0]; //O(logn) solution :) used binary search w/ pointers
        while(l <= r) {
            if(nums[l] < nums[r]) {
                res = Math.min(nums[l], res);
                break;
            }
            int mid = (l+r)/2;
            res = Math.min(nums[mid], res);
            if(nums[mid] >= nums[l]) {
                l = mid+1;
            } else {
                r = mid-1;
            }
        }
        return res;
        /*int rotations = 0; //O(n) :/
        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i] > nums[i+1]) {
                rotations = nums.length - (i);
                break;
            }
        }
        return nums[rotations];*/
    }
}