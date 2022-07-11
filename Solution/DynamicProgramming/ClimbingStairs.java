/*You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
https://leetcode.com/problems/climbing-stairs/
*/

package Solution.DynamicProgramming;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        int first = 1;
        int second = 1;

        for (int i = 2; i <= n; i++){
            int third = first + second;
            first = second;
            second = third;
        }

        return second;
    }

    public static void main(String args[]) {
        int res = climbStairs(3);
        System.out.println(res);
    }
}
