package Solution.Array;
/*You are given an array (ARR) of length N, consisting of integers. You have to find the sum of the subarray (including empty subarray) having maximum sum among all subarrays.
A subarray is a contiguous segment of an array. In other words, a subarray can be formed by removing 0 or more integers from the beginning, and 0 or more integers from the end of an array.
https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118820/offering/1381870?leftPanelTab=0
*/

public class MaxSubArraySum {
    public static long maxSubarraySum(int[] arr, int n) {
        // write your code here
        long sum = 0;
        long maxSum = 0;
        for (int i=0; i<n; i++){
            sum += arr[i];
            maxSum = Math.max(sum, maxSum);
            if (sum<0){
               sum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 7, -4, 3, 2, -10, 9, 1 };
        long result = maxSubarraySum(arr, arr.length);
        System.out.println(result);
    }
}
