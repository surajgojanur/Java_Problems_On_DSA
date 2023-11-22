class House_Robber2 {
    public int rob(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        else if(nums.length==1){
            return nums[0];
        }
        int max1=robHelper(nums,0,nums.length-2);
        int max2=robHelper(nums,1,nums.length-1);
        return Math.max(max1,max2);
    }
    private int robHelper(int[] nums,int start,int end){
        int prevMax=0;
        int currMax=0;

        for(int i=start;i<=end;i++){
            int temp=currMax;
            currMax=Math.max(prevMax+nums[i],currMax);
            prevMax=temp;
        }
        return currMax;
    }
}