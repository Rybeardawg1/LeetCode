class CoinChange {
    public static void main(String[] args) {
        CoinChange start = new CoinChange();
        int[] coins = new int[] { 2};
        System.out.println(start.coinChange(coins, 3));
    }

    public int coinChange(int[] coins, int amount) {
        int operations = 0;
        while (amount != 0) {
            for (int i = coins.length - 1; i >= 0; i--) {
                int uhoh = 0;
                if (amount - coins[i] >= 0) {
                    amount -= coins[i];
                    operations++;
                    break;
                } else {
                    uhoh++;
                    if(uhoh == coins.length)
                        return -1;
                }
            }
            
        }
        return operations;
    }
}