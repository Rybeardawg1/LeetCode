import java.util.HashMap;
import java.util.Arrays;

public class TopKFrequentElements {
    public static void main(String[] args) {
        TopKFrequentElements start = new TopKFrequentElements();
        int[] nums = new int[] { 1, 1, 2, 2, 2, 3 };
        System.out.println(Arrays.toString(start.topKFrequent(nums, 2)));
    }

    public int[] topKFrequent(int[] nums, int k) {
        int[] count = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        int[] popular = new int[k];
        for (int j = 0; j < k; j++) {
            int place = 0;
            int max = 0;
            for (int i = 0; i < count.length; i++) {
                if(count[i] > max) {
                    max = count[i];
                    place = i;
                }
            }
            count[place] = 0;
            popular[j] = place;
        }
        return popular;
    }
}