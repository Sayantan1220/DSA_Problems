/*
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.
https://leetcode.com/problems/majority-element/
*/

package Solution.Array;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int count = 0;
        int majorityElement = 0;
        for (int num : nums) {
            if (count == 0) {
                majorityElement = num;
            }
            if (num == majorityElement) {
                count += 1;
            } else {
                count -= 1;
            }
        }
        return majorityElement;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int res = majorityElement(nums);
        System.out.println(res);
    }
}
