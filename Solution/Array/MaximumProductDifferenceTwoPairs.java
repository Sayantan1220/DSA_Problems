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
