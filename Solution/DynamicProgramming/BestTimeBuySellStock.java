package Solution.DynamicProgramming;

public class BestTimeBuySellStock {
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < prices.length; i++){
            if (prices[i] < min){
                min = prices[i];
            }

            if (prices[i] - min > profit){
                profit = prices[i] - min;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        int res = maxProfit(nums);
        System.out.println(res);
    }
}
