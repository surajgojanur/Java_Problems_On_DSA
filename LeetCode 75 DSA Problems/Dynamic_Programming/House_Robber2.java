class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        if(n==2) return nums[0]>nums[1] ? nums[0] : nums[1];
        int rb1=robbing(nums,1,n-1);
        int rb2=robbing(nums,0,n-2);
        return rb1>rb2?rb1:rb2;

    }
    public int robbing(int[] nums,int start,int end){
        int pr1=0,pr2=0;
        for(int i=start;i<=end;i++){
            int cur=Math.max(pr1,pr2+nums[i]);
            pr2=pr1;
            pr1=cur;
        }
        return pr1;
    }
}
