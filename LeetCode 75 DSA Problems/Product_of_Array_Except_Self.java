class Product_of_Array_Except_Self {
    public int[] productExceptSelf(int[] nums) {
        Set <Integer> set=new HashSet<>;
        for(int num:nums)
        {
            set.add(num);
        }
        for(int set1:set)
        {
            set1 *= set;
        }
        return set1;
    }
}