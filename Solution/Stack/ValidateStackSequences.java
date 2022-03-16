/*Given two integer arrays pushed and popped each with distinct values, 
return true if this could have been the result of a sequence of push and pop operations on an initially empty stack, or false otherwise.
https://leetcode.com/problems/validate-stack-sequences/
*/

package Solution.Stack;
import java.util.Stack;

public class ValidateStackSequences {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for (int x : pushed) {
            stack.push(x);
            while (!stack.empty() && stack.peek() == popped[i]) {
                stack.pop();
                i++;
            }
        }
        return stack.empty();
    }
      
    public static void main(String args[]) {
        int[] push = {1,2,3,4,5};
        int[] pop = {4,3,5,1,2};
        boolean res = validateStackSequences(push, pop);
        System.out.println(res);
    }
}
