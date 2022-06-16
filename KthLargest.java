import java.util.PriorityQueue;

public class KthLargest {

    PriorityQueue<Integer> pq;
    int k;

    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>(k + 1);
        this.k = k;
        for (int i : nums) {
            pq.add(i);
            if (pq.size() == k + 1) {
                pq.poll();
            }
        }
    }

    public int add(int val) {
        int k = this.k;
        pq.add(val);
        if (pq.size() == k + 1) {
            pq.poll();
        }
        return pq.peek();
    }

    /*
     * int [] nums;
     * int k;
     * int val;
     * 
     * public KthLargest(int k, int[] nums) {
     * this.nums = nums;
     * this.k = k;
     * }
     * 
     * public int add(int val) {
     * int[] nums = this.nums;
     * int k = this.k;
     * int[] addedNum = new int[nums.length + 1];
     * for(int i = 0; i < addedNum.length; i++) {
     * if(i == nums.length) {
     * addedNum[i] = val;
     * }else {
     * addedNum[i] = nums[i];
     * }
     * }
     * nums = addedNum;
     * Arrays.sort(nums);
     * this.nums = nums;
     * return nums[nums.length - k];
     * }
     */
}