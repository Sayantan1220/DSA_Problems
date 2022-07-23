/*
Given an integer array nums and an integer k,
return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.
https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/
*/

package Solution.Array;

public class CountNumberPairsAbsoluteDifference {
    public static int countKDifference(int[] nums, int k) {

        int count = 0;
        for (int i = 0; i < nums.length; i++){
            int j = i + 1;
            while (j < nums.length){
                if (Math.abs(nums[i] - nums[j]) == k){
                    count += 1;
                }
                j++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1,2,2,1 };
        int k = 1;
        int result = countKDifference(arr, k);
        System.out.println(result);
    }
}
