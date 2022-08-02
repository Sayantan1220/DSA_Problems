/*
There is a robot on an m x n grid.
The robot is initially located at the top-left corner (i.e., grid[0][0]).
The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]).
The robot can only move either down or right at any point in time.
Given the two integers m and n,
return the number of possible unique paths that the robot can take to reach the bottom-right corner.
https://leetcode.com/problems/unique-paths/
TC - O(m-1) / O(n-1)
SC - O(1)
*/

package Solution.DynamicProgramming;

public class UniquePaths {
    public static int uniquePaths(int m, int n) {

        int N = n + m - 2;
        int r = n - 1;
        double result = 1;

        for (int i = 1; i <= r; i++){
            result = result * (N - r + i) / i;
        }
        return (int)result;
    }

    public static void main(String[] args) {
        int res = uniquePaths(3, 7);
        System.out.println(res);
    }
}
