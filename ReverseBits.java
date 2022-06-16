public class ReverseBits {
    public static void main(String[] args) {
        ReverseBits start = new ReverseBits();
        System.out.println(start.reverseBits(43261596));
    }

    public int reverseBits(int n) {
        if (n == 0)
            return 0;

        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = result << 1;
            if ((n & 1) == 1)
                result++;
            n >>= 1;
        }
        return result;
    }
}