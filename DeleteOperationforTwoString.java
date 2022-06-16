public class DeleteOperationforTwoStrings {
    public static void main(String[] args) {
        DeleteOperationforTwoStrings start = new DeleteOperationforTwoStrings();
        System.out.println(start.minDistance("leetcode", "etco"));
    }

    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()][word2.length()];
        for(int i = 1; i < word1.length(); i++) {
            for(int j = 1; j < word2.length(); j++) {
                if(word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[dp.length - 1][dp[0].length - 1]; 
    }
}