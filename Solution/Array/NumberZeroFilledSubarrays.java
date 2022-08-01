package Solution.Array;

import java.util.HashMap;

public class NumberZeroFilledSubarrays {

    public long zeroFilledSubarray(int[] nums) {

        long sub = 0;

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i<nums.length - 1; i++){
            if (nums[i] == 0){
                sub += 1;
                if (nums[i] + nums[i+1] == 0){
                    sub += 1;
                }
            }
        }
        return sub;
    }

}
