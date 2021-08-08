class Solution {
    public int tribonacci(int n) {
        int[] nums = new int[38];
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 1;
        if (n < 3) {
            return nums[n];
        }
        for (int i = 3; i <= n; i++) {
            nums[i] = nums[i - 1] + nums[i - 2] + nums[i - 3];
        }
        return nums[n];
        }
}
