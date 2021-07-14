public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        int[] dp = new int[array.length];
        int max = array[0];
        dp[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            int newMax = dp[i - 1] + array[i];
            if (newMax > array[i]) {
                dp[i] = newMax;
            } else {
                dp[i] = array[i];
            }
            
            if (dp[i] > max) {
                max = dp[i];
            }
        }
        return max;
    }
}
