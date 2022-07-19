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
