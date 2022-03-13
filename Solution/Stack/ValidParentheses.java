/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
push the open parenthesis into the stack
when a close parenthesis comes check if the peek matches with the same open parenthesis. Then pop the peek of the stack.
if it doesnn't match with the peek return false. After everything matches  then return the empty stack as true.
https://leetcode.com/problems/valid-parentheses/
Complexity - O(n)*/

package Solution.Stack;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        if (s == null || s.length() % 2 == 1) {
            return false;
        }
    Stack<Character> stack = new Stack<Character>();
	for (char c : s.toCharArray()) {
		if (c == '(')
			stack.push(')');
		else if (c == '{')
			stack.push('}');
		else if (c == '[')
			stack.push(']');
		else if (stack.isEmpty() || stack.pop() != c)
			return false;
	}
	return stack.isEmpty();
}

    public static void main(String args[]) {
        String s = "()[]{}";
        boolean res = isValid(s);
        System.out.println(res);
    }
}
