/*There is a broken calculator that has the integer startValue on its display initially. In one operation, you can:
multiply the number on display by 2, or
subtract 1 from the number on display.
Given two integers startValue and target, return the minimum number of operations needed to display target on the calculator.
https://leetcode.com/problems/broken-calculator/
*/

package Solution.Recursion;

public class BrokenCalculator {
    public static int brokenCalc(int startValue, int target) {
        if(startValue >= target) return startValue - target;
        if(target % 2 == 0){
            return 1 + brokenCalc(startValue, target / 2);
        }
        return 1 + brokenCalc(startValue, target + 1);
    }
    
    public static void main(String args[]) {
        int start = 3;
        int target = 10;
        int res = brokenCalc(start, target);
        System.out.println(res);
    }
}
