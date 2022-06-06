package Solution.Array;

import java.util.ArrayList;
import java.util.List;

public class SubArraySumAfterKConcatenation {
    public static long maxSubSumKConcat(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        List<Integer> list = new ArrayList();
        for(int i = 0;i<k;i++){
            list.addAll(arr);
        }
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;;
        for(int i = 0;i<k*n;i++){
            curSum += list.get(i);
            if(curSum > maxSum){
                maxSum = curSum;
            }
            if(curSum < 0){
                curSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(3);
        int k = 2;
        long result = maxSubSumKConcat(arr, arr.size(), k);
        System.out.println(result);
    }
}
