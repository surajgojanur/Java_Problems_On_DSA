import java.util.ArrayList;
import java.util.List;

class Insert_Interval{
    public int[][] insert(int[][] intervals,int newInterval){
    List<int[]> result=new ArrayList<>();
    int newStart=newInterval[0];
    int newEnd=newInterval[1];
    int i=0;
    int n=intervals.length;

    while(i<n && intervals[i][1]<newStart){
        result.add(intervals[i]);
        i++;
    }

    while (i<n && intervals[i][0]<= newEnd) {
        newStart=Math.min(newStart,intervals[i][0]);
        newEnd=Math.max(newEnd,intervals[i][1]);
        i++;
    }
    result.add(new int[]{newStart,newEnd});

    while (i<n) {
        result.add(intervals[i]);
        i++;
    }
    return result.toArray(new int[result.size()][]);
    }
}