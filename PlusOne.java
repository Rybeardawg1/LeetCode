import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        PlusOne start = new PlusOne();
        int[] nums = new int[] { 3, 8, 9 };
        System.out.println(Arrays.toString(start.plusOne(nums)));
    }

    public int[] plusOne(int[] digits) {
        int[] ans = new int[digits.length + 1];
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                if (i == 0) {
                    ans[0] = 1;
                }
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }
        return ans;
    }
}