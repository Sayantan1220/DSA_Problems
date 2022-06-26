/*Given an array of integers nums, calculate the pivot index of this array.
The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
Return the leftmost pivot index. If no such index exists, return -1.
https://leetcode.com/problems/find-pivot-index/
*/

package Solution.Array;

public class PivotIndex {
    public static int pivotIndex(int[] nums) {
        int leftSum= 0;
        int rightSum = 0;
        int totalSum = 0;
        for (int i = 0; i<nums.length; i++){
            totalSum += nums[i];
        }

        for (int i = 0; i<nums.length; i++){
            rightSum = totalSum - nums[i] - leftSum;

            if (leftSum == rightSum){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] ops = {1,7,3,6,5,6};
        int res = pivotIndex(ops);
        System.out.print(res);
    }
}
