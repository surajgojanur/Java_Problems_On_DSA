class Longest_Consecutive_Sequence{
    public int longestConsective(int[] nums){
        if(nums.length==0)return 0;
        Arrays.sort(nums);
        int max=-1;
        int cnt=0;

        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i])continue;
            else if(nums[i]-nums[i-1]==1)cnt++;
            else{
                if(cnt>max)max=cnt;
            }
        }
        if(cnt>max)max=cnt;
        return max+1;
    }
}