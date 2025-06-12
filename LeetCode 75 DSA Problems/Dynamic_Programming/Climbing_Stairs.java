class Solution {
    public int climbStairs(int n) {
        if(n<=2) return n;
        int oneStep=2;
        int twoStep=1;
        int totalStep=0;
        for(int i=3;i<=n;i++){
            totalStep=oneStep+twoStep;
            twoStep=oneStep;
            oneStep=totalStep;
        }
        return totalStep;
    }
}
