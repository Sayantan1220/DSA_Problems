/*Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and uses only constant extra space.
https://leetcode.com/problems/find-the-duplicate-number/
*/

package Solution.Array;

public class FindDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        int len = nums.length;
        int[] cnt = new int[len + 1];
        for (int i = 0; i < len; i++) {
            cnt[nums[i]]++;
            if (cnt[nums[i]] > 1) {
                return nums[i];
            }
        }
        return len;
    }

    public static void main(String args[]) {
        int nums[] = {3,1,3,4,2};
        int res = findDuplicate(nums);
        System.out.println(res);
    }  
}
