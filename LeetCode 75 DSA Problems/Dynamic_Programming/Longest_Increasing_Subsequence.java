class Longest_Increasing_Subsequence{
    public int lengthOfLIS(int[] nums) {
        int[] dp=new int[nums.length];
        int result=0;

        for(int i=nums.length-1;i>=0;i--){
            int count=0;
            for(int j=i-1;j>=0;j--){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            
            result=Math.max(count,result);
        }
        return result;
        
    }
}