class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if (nums.length < 3) {
            return 0;
        }
        int[] dp = new int[nums.length];
        int m = nums[1] - nums[0];
        dp[0] = 0;
        dp[1] = 0;
        int count = 0;
        for (int i = 2; i < dp.length; i++) {
            if (nums[i] - nums[i - 1] == m) {
                dp[i] = dp[i - 1] + 1;
                count += dp[i];
            } else {
                m = nums[i] - nums[i - 1];
            }
        }
        return count;
    }
}
