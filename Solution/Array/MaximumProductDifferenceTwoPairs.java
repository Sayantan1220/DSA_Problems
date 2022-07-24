/*
The product difference between two pairs (a, b) and (c, d) is defined as (a * b) - (c * d).
For example, the product difference between (5, 6) and (2, 7) is (5 * 6) - (2 * 7) = 16.
Given an integer array nums, choose four distinct indices w, x, y, and z such that
the product difference between pairs (nums[w], nums[x]) and (nums[y], nums[z]) is maximized.
Return the maximum such product difference.
https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
*/

package Solution.Array;

public class MaximumProductDifferenceTwoPairs {
    public static int maxProductDifference(int[] nums) {

        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE, min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE, res = 0;
        for (int num : nums){
            if (num > max){
                secondMax = max;
                max = num;
            }
            else if (num > secondMax){
                secondMax = num;
            }

            if (num < min){
                secondMin = min;
                min = num;
            }
            else if (num < secondMin){
                secondMin = num;
            }
        }
        res = (max * secondMax) - (min * secondMin);
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2,9,5,9,1};
        int result = maxProductDifference(nums);
        System.out.println(result);
    }
}
