/*
Given an unsorted array of integers nums,
return the length of the longest consecutive elements sequence.
You must write an algorithm that runs in O(n) time.
https://leetcode.com/problems/longest-consecutive-sequence/
*/

package Solution.Array;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> num_set = new HashSet<Integer>();
        for (int num : nums) {
            num_set.add(num);
        }

        int longestStreak = 0;

        for (int num : num_set) {
            if (!num_set.contains(num-1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (num_set.contains(currentNum+1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,4,1,8,1};
        int res = longestConsecutive(nums);
        System.out.println(res);
    }
}
