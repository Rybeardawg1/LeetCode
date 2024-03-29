public class HouseRobberII {
    public static void main(String[] args) {
        HouseRobberII start = new HouseRobberII();
        int[] nums = new int[] {2,3,2};
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