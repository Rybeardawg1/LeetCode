public class NumberOf1Bits {
    public static void main(String[]args) {
        System.out.println(hammingWeight(000000000000000001011101111));
    }
    public static int hammingWeight(int n) {
        
        int res = 0;
        while(n != 0) {
            n &= (n - 1);
            res += 1;
        }
        return res;

        /*int res = 0;
        while(n != 0) {
            res += n % 2;
        }
        return res;
        */
    }
}