class MissingNumber {
    public static void main(String[] args) {
        MissingNumber start = new MissingNumber();
        int[] nums = new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        System.out.println(start.missingNumber(nums));
    }

    public int missingNumber(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        return nums.length * (nums.length + 1) / 2 - total;
    }
}