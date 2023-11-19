class Counting_Bits {
    public int[] countBits(int n) {
        
        
        int[] output=new int[n+1];
        for(int j=0;j<=n;j++){
            int helper=1;
            int result=0;
        for(int i=0;i<=32;i++){
            if((helper&j) != 0){
                result++;
            }
            helper=helper<<1;
        }
      output[j]=result;
        }
    return output;
    }
}