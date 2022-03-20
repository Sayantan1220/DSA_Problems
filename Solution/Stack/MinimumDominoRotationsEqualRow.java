/*In a row of dominoes, tops[i] and bottoms[i] represent the top and bottom halves of the ith domino. (A domino is a tile with two numbers from 1 to 6 - one on each half of the tile.)
We may rotate the ith domino, so that tops[i] and bottoms[i] swap values.
Return the minimum number of rotations so that all the values in tops are the same, or all the values in bottoms are the same.
If it cannot be done, return -1.
https://leetcode.com/problems/minimum-domino-rotations-for-equal-row/
*/

package Solution.Stack;

public class MinimumDominoRotationsEqualRow {
    public static int minDominoRotations(int[] A, int[] B) {
        int[] countA = new int[7], countB = new int[7], same = new int[7];
        int n = A.length;
        for (int i = 0; i < n; ++i) {
            countA[A[i]]++;
            countB[B[i]]++;
            if (A[i] == B[i])
                same[A[i]]++;
        }
        for (int i  = 1; i < 7; ++i)
            if (countA[i] + countB[i] - same[i] == n)
                return n - Math.max(countA[i], countB[i]);
        return -1;
    }   

    public static void main(String args[]) {
        int[] top = {2,1,2,4,2,2};
        int[] bottom = {5,2,6,2,3,2};
        int res = minDominoRotations(top, bottom);
        System.out.println(res);
    }
}
