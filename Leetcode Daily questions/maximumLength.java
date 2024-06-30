class Solution {
    public int maximumLength(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int fg=0;
        int n=nums.length;
        int count=0;
        
        for(int i=0;i<n;i++){
            if(nums[i]%2==fg){
                count++;
                fg=1-fg;
            }
        }
        ans=Math.max(ans,count);
        
        fg=1;
        count=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==fg){
                count++;
                fg=1-fg;
            }
        }
        ans=Math.max(ans,count);
        
        fg=0;
        count=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==fg){
                count++;
            }
        }
        ans=Math.max(ans,count);
        
        fg=01;
        count=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==fg){
                count++;
            }
        }
        ans=Math.max(ans,count);
        return ans;
    }
}