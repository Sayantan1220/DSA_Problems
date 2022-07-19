/*You are given an m x n integer grid accounts where accounts[i][j] is the amount of money
the ith customer has in the jth bank.
Return the wealth that the richest customer has.
A customer's wealth is the amount of money they have in all their bank accounts.
The richest customer is the customer that has the maximum wealth.
https://leetcode.com/problems/richest-customer-wealth/
*/

package Solution.Array;

public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {

        int wealth = 0;
        for (int[] customer : accounts){
            int sum = 0;
            for (int money : customer){
                sum = sum + money;
            }
            wealth = Math.max(wealth, sum);
        }
        return wealth;
    }

    public static void main(String args[]) {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        int res = maximumWealth(accounts);
        System.out.print(res);
    }
}
