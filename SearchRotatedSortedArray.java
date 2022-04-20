public class SearchRotatedSortedArray {
    public static void main(String[]args) {
        int[] nums = new int[]{4,5,6,7,0,1,2};
        int target = 3;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;
        
        while(left <= right) {
            int middle = (left+right)/2;
            if(target == nums[middle]) {
                return middle;
            }
            if(nums[left] <= nums[middle]) {
                if(target > nums[middle] || target < nums[left]) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }else {
                if(target < nums[middle] || target > nums[right]) {
                    right = middle - 1;
                } else {
                    left = middle + 1;    
                }
            }
        }
        return -1;
    }
}