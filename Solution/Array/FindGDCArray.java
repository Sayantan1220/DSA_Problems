/*
Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.
The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
https://leetcode.com/problems/find-greatest-common-divisor-of-array/
*/

package Solution.Array;

public class FindGDCArray {
    public static int findGCD(int[] nums) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int gcd = 1;

        for (int num : nums){
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        for (int i = 1; i <= min; i++){
            if (min % i == 0 && max % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,6,9,10};
        int result = findGCD(nums);
        System.out.println(result);
    }
}
