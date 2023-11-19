class Climbing_Stairs {
    public int climbStairs(int n) {
        if(2>=n){
            return n;
        }

        int first=1;
        int second=2;
        int third=0;

        for(int i=3;i<=n;i++){
            third=first+second;
            first=second;
            second=third;
        }
        return third;

}
}