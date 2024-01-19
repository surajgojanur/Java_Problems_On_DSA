class Non_overlapping_Intervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals==null || intervals.length==0){
        return 0;
    }

    Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));

    int count=0;
    int prevEnd=intervals[0][1];

    for(int i=1;i<intervals.length;i++){
        if(intervals[i][0]<prevEnd){
            count++;
        }
        else{
            prevEnd=intervals[i][1];
        }
//suraj
    }
    return count;
}
}