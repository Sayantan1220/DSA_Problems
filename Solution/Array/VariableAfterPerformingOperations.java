/*There is a programming language with only four operations and one variable X:
++X and X++ increments the value of the variable X by 1.
--X and X-- decrements the value of the variable X by 1.
Initially, the value of X is 0.
Given an array of strings operations containing a list of operations,
return the final value of X after performing all the operations.
https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
*/

package Solution.Array;

public class VariableAfterPerformingOperations {
    public static int finalValueAfterOperations(String[] operations) {

        int x = 0;
        for (String operation : operations){
            if (operation.startsWith("++") || operation.endsWith("++")){
                x += 1;
            }
            else{
                x -= 1;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        String arr[] = { "--X","X++","X++" };
        int result = finalValueAfterOperations(arr);
        System.out.println(result);
    }
}
