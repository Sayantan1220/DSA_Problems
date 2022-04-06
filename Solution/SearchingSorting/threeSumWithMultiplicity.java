/*Given an integer array arr, and an integer target, 
return the number of tuples i, j, k such that i < j < k and arr[i] + arr[j] + arr[k] == target.
As the answer can be very large, return it modulo 109 + 7.
https://leetcode.com/problems/3sum-with-multiplicity/
*/

package Solution.SearchingSorting;

public class ThreeSumWithMultiplicity {
    public static int threeSumMulti(int[] A, int target) {
        long[] c = new long[101];
        for (int a : A) c[a]++;
        long res = 0;
        for (int i = 0; i <= 100; i++)
            for (int j = i; j <= 100; j++) {
                int k = target - i - j;
                if (k > 100 || k < 0) continue;
                if (i == j && j == k)
                    res += c[i] * (c[i] - 1) * (c[i] - 2) / 6;
                else if (i == j && j != k)
                    res += c[i] * (c[i] - 1) / 2 * c[k];
                else if (j < k)
                    res += c[i] * c[j] * c[k];
            }
        return (int)(res % (1e9 + 7));
    }

    public static void main(String args[]) {
        int A[] = {1,1,2,2,3,3,4,4,5,5};
        int target = 8;
        int res = threeSumMulti(A, target);
        System.out.println(res);
    }
}
