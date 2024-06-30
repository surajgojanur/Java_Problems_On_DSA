class Solution {
    public int maximumLengthwithK(int[] nums, int k) {
         int n1 = nums.length;
        int[][] dp = new int[n1][k];
        
        fillDPTable(nums, k, dp);
        
        return findMaxSubsequenceLength(dp);
    }
    
    private void fillDPTable(int[] nums, int k, int[][] dp) {
        int n1 = nums.length;
        
        for (int i = 0; i < n1; i++) {
            Arrays.fill(dp[i], 1);
            for (int j = 0; j < i; j++) {
                int remainder = (nums[i] + nums[j]) % k;
                dp[i][remainder] = Math.max(dp[i][remainder], dp[j][remainder] + 1);
            }
        }
    }
    
    private int findMaxSubsequenceLength(int[][] dp) {
        int maxLength1 = 0;
        for (int[] row : dp) {
            for (int length : row) {
                maxLength1 = Math.max(maxLength1, length);
            }
        }
        
        return maxLength1;
    }
}