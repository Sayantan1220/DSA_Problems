package Solution.Array;

import java.util.ArrayList;
import java.util.Arrays;
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
