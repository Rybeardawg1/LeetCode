public class BuyStock {
    public static void main(String[]args) {
        int[] prices = new int[]{1,2,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int l = 0, r = 1, difference = 0;
        
        while(r < prices.length) {
            if(prices[l] < prices[r]) {
                int profit = prices[r] - prices[l];
                difference = Math.max(difference, profit);
                
            } else {
                l += 1;
                r += 1;
            }
        }
        return difference;
    }
}