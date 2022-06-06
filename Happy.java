import java.util.Arrays;
import java.util.ArrayList;

public class Happy {

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {
        ArrayList<Integer> visited = new ArrayList<>();
        while (!visited.contains(n) && n != 1) {
            visited.add(n);
            String number = String.valueOf(n);
            int[] nums = new int[number.length()];
            for (int i = 0; i < number.length(); i++) {
                nums[i] = Character.getNumericValue(number.charAt(i));
            }
            for (int i = 0; i < number.length(); i++) {
                nums[i] = (int) Math.pow(nums[i], 2);
            }
            n = Arrays.stream(nums).sum();
        }
        return n == 1;
    }
}