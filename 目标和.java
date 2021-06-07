class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int value : nums) {
            sum += value;
        }
        double neg = (double)(sum - target) / 2;
        if (neg - (int)neg > 0 || neg < 0) {
            return 0;
        } else {
            int negZ = (int) neg;
            int[][] dp = new int[nums.length + 1][negZ + 1];
            dp[0][0] = 1;
            for (int i = 1; i < dp.length; i++) {
                int num = nums[i - 1];
                for (int j = 0; j < dp[0].length; j++) {
                    dp[i][j] = dp[i - 1][j];
                    if (j >= num) {
                        dp[i][j] += dp[i - 1][j - num];
                    }
                }
            }
            return dp[nums.length][negZ];
        }
        }
}
