/*You are keeping score for a baseball game with strange rules. 
The game consists of several rounds, where the scores of past rounds may affect future rounds' scores.
At the beginning of the game, you start with an empty record. You are given a list of strings ops, 
where ops[i] is the ith operation you must apply to the record and is one of the following:
An integer x - Record a new score of x.
"+" - Record a new score that is the sum of the previous two scores. It is guaranteed there will always be two previous scores.
"D" - Record a new score that is double the previous score. It is guaranteed there will always be a previous score.
"C" - Invalidate the previous score, removing it from the record. It is guaranteed there will always be a previous score.
Return the sum of all the scores on the record.
https://leetcode.com/problems/baseball-game/
*/

package Solution.Array;
import java.util.LinkedList;

public class BaseballGame {
    public static int calPoints(String[] ops) {
        int sum = 0;
        LinkedList<Integer> list = new LinkedList<>();
        for (String op : ops) {
            if (op.equals("C")) {
                sum -= list.removeLast();
            }
            else if (op.equals("D")) {
                list.add(list.peekLast() * 2);
                sum += list.peekLast();
            }
            else if (op.equals("+")) {
                list.add(list.peekLast() + list.get(list.size() - 2));
                sum += list.peekLast();
            }
            else {
                list.add(Integer.parseInt(op));
                sum += list.peekLast();
            }
        }
        return sum;
    }  

    public static void main(String args[]) {
        String ops[] = {"5","-2","4","C","D","9","+","+"};
        int res = calPoints(ops);
        System.out.println(res);
    }
}
