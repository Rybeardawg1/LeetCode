public class HouseRobber {
    public static void main(String[] args) {
        HouseRobber start = new HouseRobber();
        int[] nums = new int[] {0, 0, 9, 10, 10, 20};
        System.out.println(start.rob(nums));
    }

    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        nums[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            nums[i] = Math.max(nums[i - 2] + nums[i], nums[i - 1]);
        }
        return nums[nums.length - 1];
    }
}