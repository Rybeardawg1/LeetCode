import java.util.HashMap;

public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger start = new ReverseInteger();
        System.out.println(start.reverse(-120));
    }

    public int reverse(int x) {
        HashMap<Integer> map = new HashMap<>();
        
        String reversed = "";
        int z = x;
        while (z != 0) {
            int digit = z % 10;
            z /= 10;
            reversed = reversed + Math.abs(digit);
        }
        z = Integer.valueOf(reversed);
        return x < 0 ? -z : z;
        
    }
}