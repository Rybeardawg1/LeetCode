import java.util.Arrays;

public class KokoEatingBananas {
    public static void main(String[] args) {
        KokoEatingBananas start = new KokoEatingBananas();
        int[] piles = new int[] { 30, 11, 23, 4, 20 };
        System.out.println(start.minEatingSpeed(piles, 5));
    }

    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = 10000;
        int mid = 0;
        while (min < max) {
            mid = (max - min) / 2 + min;
            int total = 0;
            for(int i : piles) {
                total += (i + mid - 1) / mid;
            }
            if(total > h) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        return min;
    }
}