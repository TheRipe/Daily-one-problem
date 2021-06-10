class Solution {
	    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int value : coins) {
            for (int i = value; i <= amount; i++) {
                dp[i] += dp[i - value];
            }
        }
        return dp[amount];
    }

