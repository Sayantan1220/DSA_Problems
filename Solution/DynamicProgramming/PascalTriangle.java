/*
Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it.
https://leetcode.com/problems/pascals-triangle/
*/

package Solution.DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> row, pre = null;

        for (int i = 0; i < numRows; i++){
            row = new ArrayList<>();
            for (int j = 0; j <= i; j++){
                if (j == 0 || j == i){
                    row.add(1);
                }
                else{
                    row.add(pre.get(j - 1) + pre.get(j));
                }
            }
            pre = row;
            res.add(row);
        }
        return res;
    }

    public static void main(String args[]) {
        List<List<Integer>> res = generate(5);
        System.out.println(res);
    }
}
