import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public static void main(String[]args) {
        int[] nums = new int[]{0, 2, -1, 4, -2, -2};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>> (); 
        
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                for(int l = 0; l < nums.length; l++) {
                    if(nums[i] + nums[j] + nums[l] == 0 && i!=j && l!=j && i!=l) {
                        List<Integer> list1 = new ArrayList<Integer> ();
                        list1.add(nums[i]);
                        list1.add(nums[j]);
                        list1.add(nums[l]);
                        list1.sort
                        list.add(list1);
                    }
                }
            }
        }
        return list;
    }

}