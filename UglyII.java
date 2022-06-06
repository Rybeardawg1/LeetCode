import java.util.ArrayList;

public class UglyII {
    public static void main(String[]agrs) {
        UglyII ugly = new UglyII();
        System.out.println(ugly.nthUglyNumber(1352));
    }

    public int nthUglyNumber(int n) {
        ArrayList<Integer> uglies = new ArrayList(); 
        
        for(int i = 0; uglies.size() < n; i++) {
            if(isUgly(i)) {
                uglies.add(i);
            }
        }
        return uglies.get(n - 1);
    }

    public boolean isUgly(int n) {
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else if (n % 3 == 0) {
                n /= 3;
            } else if (n % 5 == 0) {
                n /= 5;
            } else {
                return false;
            }
        }
        return n == 1;
    }
}