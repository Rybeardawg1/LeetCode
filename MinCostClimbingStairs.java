public class MinCostClimbingStairs {
    public static void main(String[] args) {
        MinCostClimbingStairs start = new MinCostClimbingStairs();
        int[] cost = new int[] { 20, 20, 90, 20 };
        System.out.println(start.minCostClimbingStairs(cost));
    }

    public int minCostClimbingStairs(int[] cost) {
        for (int i = 2; i < cost.length; i++) {
            cost[i] += Math.min(cost[i - 1], cost[i - 2]);
        }
        return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
    }
}