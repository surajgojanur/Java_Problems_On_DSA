class Search_in_Rotated_Sorted_Array2{
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int output=-1;
        while(left<=right){
            int mid=left+(right-left)/2;

            if(nums[mid]==target){
                output=mid;
                break;
            }

            if(nums[left]<=nums[mid]){
                if (nums[left] <= target && target < nums[mid]){
                    right = mid-1;
                }
                else{
                    left=mid+1;
                }
            }else{
                if(nums[mid] < target && target <= nums[right]){
                    left = mid + 1;
                }else{
                    right = mid -1;
                }
            }

        }
        return output;
        
    }
}