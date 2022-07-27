/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
*/

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
