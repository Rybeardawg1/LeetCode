import java.util.Arrays;

public class climbingStairs {

    public static void main(String[]args) {
        climbingStairs start = new climbingStairs();
        System.out.println(start.climbStairs(45));
    }
    /* 
    public int climbStairs(int n) {
        int path = 0;
        if(n == 0) {
            return 1;
        }else if(n < 0) {
            return 0;
        }
        path = climbStairs(n - 1);
        path += climbStairs(n - 2);
        return path;    
    }*/
    
    public int climbStairs(int n) {
        int[] key = new int[n + 1];
        key[0] = 1;
        key[1] = 1;
        for(int i = 2; i <= n; i++) {
            key[i] = key[i - 1] + key[i - 2];
        }
        return key[n];
    }
}