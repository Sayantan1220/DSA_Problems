/*Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. 
This matrix has the following properties:
Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
https://leetcode.com/problems/search-a-2d-matrix/
*/

package Solution.Matrix;

public class Search2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int i = 0, j = matrix[0].length - 1;
        while(i < matrix.length && j >= 0) {
          if(matrix[i][j] == target)
            return true;
          else if(matrix[i][j] > target)
            j--;
          else if(matrix[i][j] < target)
            i++;
        }
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        boolean res = searchMatrix(matrix, target);
        System.out.println(res);
    }
}
