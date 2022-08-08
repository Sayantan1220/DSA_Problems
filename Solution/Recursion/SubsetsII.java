package Solution.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SubsetsII {
    public static void subset(int idx , List<Integer> ds , HashSet<List<Integer>> set , int[] nums){
        if(idx==nums.length){
            set.add(new ArrayList<>(ds));
            return;
        }
        //picking up the element..
        ds.add(nums[idx]);
        subset(idx+1 , ds , set , nums);

        //leave the element...
        ds.remove(ds.size()-1);
        subset(idx+1 , ds , set , nums);
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ds = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();

        subset(0 , ds , set , nums);

        List<List<Integer>> ans = new ArrayList<>();
        ans.addAll(set);

        return ans;

    }

    public static void main(String[] args) {
        int[] nums = {1,2,2};
        List<List<Integer>> res = subsetsWithDup(nums);
        System.out.println(res);
    }
}
