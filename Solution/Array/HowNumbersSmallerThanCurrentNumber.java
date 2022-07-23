/*
Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. 4
That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
Return the answer in an array.
https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
*/

package Solution.Array;

import java.util.Arrays;

public class HowNumbersSmallerThanCurrentNumber {
    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            int count = 0;
            for (int j = 0; j<nums.length; j++){
                if (i == j){
                    continue;
                }
                if (nums[i] > nums[j]){
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 8,1,2,2,3 };
        int[] result = smallerNumbersThanCurrent(arr);
        System.out.println(Arrays.toString(result));
    }
}
