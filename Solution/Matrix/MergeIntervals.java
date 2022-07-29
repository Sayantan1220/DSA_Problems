package Solution.Matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {

        List<int[]> res = new ArrayList<>();
        if (intervals.length == 0){
            return res.toArray(new int[0][]);
        }

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int[] interval : intervals){
            if (interval[0] <= end){
                end = Math.max(interval[1], end);
            }
            else {
                res.add(new int[]{start, end});
                start = interval[0];
                end = interval[1];
            }
        }
        res.add(new int[]{start, end});
        return res.toArray(new int[0][]);
    }

    public static void main(String args[]) {
        int intervals[][] = {{1,3},{2,6},{8,10},{15,18}};
        int[][] res = merge(intervals);
        System.out.println(Arrays.deepToString(res));
    }
}
