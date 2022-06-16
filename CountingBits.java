import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
        CountingBits start = new CountingBits();
        System.out.println(Arrays.toString(start.countBits(100000)));
    }

    public int[] countBits(int n) {
        int[] nums = new int[n + 1];
        for(int i = 0; i <= n; i++) {
            int temp = i;
            int res = 0;
            while (temp != 0) {
                temp &= temp - 1;
                res++;
            }
            nums[i] = res;
        }
        return nums;
    }
}