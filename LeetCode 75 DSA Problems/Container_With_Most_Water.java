class Container_With_Most_Water{
    public int maxArea(int[] height){
        int max=height[0];
        int max2=height[1];
        int temp=0;
        for(int i=0;i<height.length;i++){
            if(max<height[i]){
                temp=max;
                max=height[i];
                max2=temp;

        
    }
}