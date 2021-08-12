class Solution {
    public int longestPalindromeSubseq(String s) {
        char[] str = s.toCharArray();
        int[][] dp = new int[str.length][str.length];
        for (int i = 0; i < dp.length; i++) {
            dp[i][i] = 1;
        }
        for (int i = dp.length - 1; i >= 0; i--) {
            char c = str[i];
            for (int j = i + 1; j < dp.length; j++) {
                char d = str[j];
                if (c == d) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][s.length() - 1];
        }
}
