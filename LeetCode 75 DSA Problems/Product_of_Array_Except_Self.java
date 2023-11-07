class Product_of_Array_Except_Self {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] output=new int[n];
        int rightSide=1;
        int leftSide=1;

        for(int i=0;i<n;i++){
            output[i]=leftSide;
            leftSide *= nums[i];
        }

        for(int j=n-1; j>=0;j--){
            output[j] *= rightSide;
            rightSide *= nums[j];
        }

        return output;
        
    }
}