/*There are n kids with candies.
You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has,
and an integer extraCandies, denoting the number of extra candies that you have.
Return a boolean array result of length n, where result[i] is true if,
after giving the ith kid all the extraCandies,
they will have the greatest number of candies among all the kids, or false otherwise.
Note that multiple kids can have the greatest number of candies.
https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 */

package Solution.Array;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = 0;
        List<Boolean> res = new ArrayList<>();
        for (int j : candies) {
            max = Math.max(max, j);
        }

        for (int candy : candies) {
            res.add(candy + extraCandies >= max);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 2,3,5,1,3 };
        int n = 3;
        List<Boolean> result = kidsWithCandies(arr, n);
        System.out.println(result);
    }
}
