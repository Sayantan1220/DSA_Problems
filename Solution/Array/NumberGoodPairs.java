/*Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.
https://leetcode.com/problems/number-of-good-pairs/
*/

package Solution.Array;

public class NumberGoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i<nums.length-1; i++){
            for (int j = i+1; j<nums.length; j++){
                if (nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1,2,3,1,1,3 };
        long result = numIdenticalPairs(arr);
        System.out.println(result);
    }
}
