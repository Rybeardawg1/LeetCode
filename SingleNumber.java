public class SingleNumber {
    public static void main(String[] args) {
        SingleNumber start = new SingleNumber();
        int[] nums = new int[] { 4, 3, 1, 2, 1, 2, 3 };
        System.out.println(start.singleNumber(nums));
    }

    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i : nums) {
            ans ^= i;
        }
        return ans;
    }
}