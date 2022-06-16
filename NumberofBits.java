public class NumberofBits {
    public static void main(String[] args) {
        NumberofBits start = new NumberofBits();
        System.out.println(start.hammingWeight(11));
    }

    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            n &= n - 1;
            res++;
        }
        return res;
    }
}