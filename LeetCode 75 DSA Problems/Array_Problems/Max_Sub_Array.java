class Max_Sub_Array {
    public int maxSubArray(int[] nums) {
        int total = 0;
        int max = Integer.MIN_VALUE; // Initialize max to a very small number

        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            if (max < total) {
                max = total;
            }
            if (total < 0) {
                total = 0; // Reset total if it becomes negative
            }
        }
        return max;
    }
}