/*A company is planning to interview 2n people. 
Given the array costs where costs[i] = [aCosti, bCosti], the cost of flying the ith person to city a is aCosti, and the cost of flying the ith person to city b is bCosti.
Return the minimum cost to fly every person to a city such that exactly n people arrive in each city.
https://leetcode.com/problems/two-city-scheduling/
*/

package Solution.Array;
import java.util.*;

public class TwoCityScheduling {
    public static int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a, b) -> {
            return (a[0] - a[1]) - (b[0] - b[1]);
        });
        
        int price = 0;
        for(int i = 0; i < costs.length / 2; i++){
            price += costs[i][0];
        }
        for(int i = costs.length / 2; i < costs.length; i++){
            price += costs[i][1];
        }
        return price;
    }

    public static void main(String args[]) {
        int cost[][] = {{10,20},{30,200},{400,50},{30,20}};
        int res = twoCitySchedCost(cost);
        System.out.println(res);
    }  
}
