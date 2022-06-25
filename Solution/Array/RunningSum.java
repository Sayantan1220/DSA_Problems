package Solution.Array;

public class RunningSum {
    public static int[] runningSum(int[] nums) {
        int sum = nums[0];
        if (nums.length <= 1){
            return nums;
        }
        for (int i=1; i<nums.length; i++){
            sum += nums[i];
            nums[i] =  sum;
        }
        return nums;
    }

    public static void main(String args[]) {
        int[] ops = {1,2,3,4};
        int[] res = runningSum(ops);
        for (int i=0; i<res.length; i++){
            System.out.print(res[i] + ", ");
        }
    }
}
