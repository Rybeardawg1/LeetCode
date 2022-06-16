public class RemoveOneElementArrayStrictlyIncreasing {
    public static void main(String[] args) {
        RemoveOneElementArrayStrictlyIncreasing start = new RemoveOneElementArrayStrictlyIncreasing();
        int[] nums = new int[] { 1, 2, 10, 5, 7 };
        System.out.println(start.canBeIncreasing(nums));
    }

    public boolean canBeIncreasing(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                count++;
                if(count > 1) {
                    return false;
                }
            }
        }
    return true;
    }
}