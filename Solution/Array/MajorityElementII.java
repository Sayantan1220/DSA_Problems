package Solution.Array;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
    public static List<Integer> majorityElement(int[] nums) {
        int num1 = -1;
        int num2 = -1;
        int count1 = 0;
        int count2 = 0;

        for (int num : nums){
            if (num == num1){
                count1++;
            }
            else if (num == num2){
                count2++;
            }
            else if (count1 == 0){
                num1 = num;
                count1 = 1;
            }
            else if (count2 == 0){
                num2 = num;
                count2 = 1;
            }
            else{
                count1--;
                count2--;
            }
        }

        List<Integer> majorityElement = new ArrayList<>();
        count1 = 0;
        count2 = 0;
        int majority = nums.length / 3;
        for (int num : nums){
            if (num == num1){
                count1++;
            }
            else if (num == num2){
                count2++;
            }
        }
        if (count1 > majority){
            majorityElement.add(num1);
        }
        if (count2 > majority){
            majorityElement.add(num2);
        }
        return majorityElement;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        List<Integer> res = majorityElement(nums);
        System.out.println(res);
    }
}
