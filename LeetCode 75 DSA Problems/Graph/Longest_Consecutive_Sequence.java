class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        else if(nums.length==1){
            return 1;
        }
        Arrays.sort(nums);
        int currentStrek=1;
        int longestStrek=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            else if(nums[i]==nums[i-1]+1){
                currentStrek++;
            }
            else{
                currentStrek=1;
            }
            longestStrek=Math.max(currentStrek,longestStrek);
        }
        return longestStrek;
    }
}
