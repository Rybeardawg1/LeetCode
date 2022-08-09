public class BuyStock {
    public static void main(String[] args) {
        int[] prices = new int[] { 7, 1, 5, 3, 6, 4 };
        BuyStock start = new BuyStock();
        System.out.println(start.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int max = 0;
        for (int i : prices) {
            if (i < buy)
                buy = i;
            if (i > buy) {
                max = Math.max(max, i - buy);
            }
        }
        return max;
    }
}