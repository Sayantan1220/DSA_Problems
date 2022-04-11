/*Given a 2D grid of size m x n and an integer k. You need to shift the grid k times
In one shift operation:
Element at grid[i][j] moves to grid[i][j + 1].
Element at grid[i][n - 1] moves to grid[i + 1][0].
Element at grid[m - 1][n - 1] moves to grid[0][0].
Return the 2D grid after applying shift operation k times.
https://leetcode.com/problems/shift-2d-grid/
*/

package Solution.Matrix;
import java.util.ArrayList;
import java.util.List;

public class Shift2DGrid {
    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> result = new ArrayList();
        int rows = grid.length, col = grid[0].length;

        for (int r = 0; r < rows; r++)// filling all the rows of result with empty lists
            result.add(new ArrayList());
        k %= (rows * col);// every rows*col shifts grid became the same, skipping the similar shifts
        int dimension = rows * col;
        int begin = dimension - k;// element at (begin) will be at 0,0 in new grid
        int x = 0;// counter variable
        for (int i = begin; i < begin + dimension; i++) {
            int r = (i / col) % rows, c = i % col;// calculating row and cell for new grid
            result.get(x / col).add(grid[r][c]);// adding new element in new row
            x++;
        }
        return result;// returning result list
    }
    
    public static void main(String args[]) {
        int grid[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int k = 1;
        List<List<Integer>> res = shiftGrid(grid, k);
        System.out.println(res);
    }
}
