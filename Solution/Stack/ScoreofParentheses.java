/*Given a balanced parentheses string s, return the score of the string.
The score of a balanced parentheses string is based on the following rule:
"()" has score 1.
AB has score A + B, where A and B are balanced parentheses strings.
(A) has score 2 * A, where A is a balanced parentheses string.
https://leetcode.com/problems/score-of-parentheses/
*/

package Solution.Stack;
import java.util.Stack;

public class ScoreofParentheses {
    public static int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int cur = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(cur);
                cur = 0;
            } else {
                cur = stack.pop() + Math.max(cur * 2, 1);
            }
        }
        return cur;
    }    

    public static void main(String args[]) {
        String s = "(())";
        int res = scoreOfParentheses(s);
        System.out.println(res);
    }
}
