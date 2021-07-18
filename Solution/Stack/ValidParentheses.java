/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
push the open parenthesis into the stack
when a close parenthesis comes check if the peek matches with the same open parenthesis. Then pop the peek of the stack.
if it doesnn't match with the peek return false. After everything matches  then return the empty stack as true.
Complexity - O(n)*/

package Solution.Stack;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        if (s == null || s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')' && !st.empty() && st.peek() == '(') {
                st.pop();
            } else if (ch == '}' && !st.empty() && st.peek() == '{') {
                st.pop();
            } else if (ch == ']' && !st.empty() && st.peek() == '[') {
                st.pop();
            } else
                return false;
        }
        return st.empty();
    }

    public static void main(String args[]) {
        String s = "()[]{}";
        boolean res = isValid(s);
        System.out.println(res);
    }

}
